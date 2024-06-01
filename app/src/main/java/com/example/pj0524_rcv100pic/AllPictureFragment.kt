package com.example.pj0524_rcv100pic

import android.content.Context
import android.content.SharedPreferences
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pj0524_rcv100pic.databinding.FragmentAllPictureBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class AllPictureFragment : Fragment(R.layout.fragment_all_picture) {
    //    binding
    private var _binding: FragmentAllPictureBinding? = null
    private val binding get() = _binding!!

    companion object {
        const val TAG = "AllPictureFragment"
    }
     lateinit var pictureList: MutableList<PictureItem>
     lateinit var tempAdapter: PictureAdapter
    private var indexSelected = -1 // -1 là không có item nào được chọn

    lateinit var sharedPreferences: SharedPreferences


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        khởi tạo viewbinding
        _binding = FragmentAllPictureBinding.bind(view)
//        gán list
        pictureList = generatePictureList()

//        truyền position và fun goToDetailFragment vào adapter
        tempAdapter = PictureAdapter(pictureList,  object : PictureAdapter.OnItemClickInterface {
            override fun onItemClick(pictureItem: PictureItem, position: Int) {
//                truyền vào
                indexSelected = position
                (activity as MainActivity).goToDetailFragment(pictureItem)
            }
        })

        binding.rcvAllPictures.adapter = tempAdapter
        binding.rcvAllPictures.layoutManager = GridLayoutManager(
            requireContext(),
            2,
            LinearLayoutManager.VERTICAL,
            false
        )

        // Show ds size ban đầu
        (activity as? MainActivity)?.updateLengthText(pictureList.size)
        (activity as? MainActivity)?.imgVM?.observe(activity as LifecycleOwner) {
            Log.i(TAG, "observe PictureItem Livedata $it")

            if (indexSelected != -1) {
                pictureList[indexSelected] = it
                tempAdapter.updateData(pictureList)
            }
        }
    }

    fun filterOddNumbers() {
        val filteredList = pictureList.filter { it.odd }.toMutableList()
        tempAdapter.updateData(filteredList)

        // Update list size
        (activity as? MainActivity)?.updateLengthText(tempAdapter.itemCount)
    }

    private fun generatePictureList(): MutableList<PictureItem> {
        return mutableListOf(
            PictureItem("https://wallpaperaccess.com/full/46195.jpg"),
            PictureItem("https://wallpaperaccess.com/full/461967.jpg"),
            PictureItem("https://wallpaperaccess.com/full/131641.jpg"),
            PictureItem("https://wallpaperaccess.com/full/462014.jpg"),
            PictureItem("https://wallpaperaccess.com/full/462016.jpg"),
            PictureItem("https://wallpaperaccess.com/full/462100.jpg"),
            PictureItem("https://wallpaperaccess.com/full/46195.jpg"),
            PictureItem("https://wallpaperaccess.com/full/461967.jpg"),
            PictureItem("https://wallpaperaccess.com/full/131641.jpg"),
            PictureItem("https://wallpaperaccess.com/full/462014.jpg"),
            PictureItem("https://wallpaperaccess.com/full/462016.jpg"),
            PictureItem("https://wallpaperaccess.com/full/462100.jpg"),
            PictureItem("https://wallpaperaccess.com/full/46195.jpg"),
            PictureItem("https://wallpaperaccess.com/full/461967.jpg"),
            PictureItem("https://wallpaperaccess.com/full/131641.jpg"),
            PictureItem("https://wallpaperaccess.com/full/462014.jpg"),
            PictureItem("https://wallpaperaccess.com/full/462016.jpg"),
            PictureItem("https://wallpaperaccess.com/full/462100.jpg")
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Clean up the binding reference
        _binding = null
    }

    override fun onPause() {
        super.onPause()
        saveData()
    }

    override fun onResume() {
        super.onResume()
        loadData()
    }

    private fun saveData() {
        sharedPreferences = requireContext().getSharedPreferences("shareData", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        val gson = Gson()
        val json = gson.toJson(pictureList)
        editor.putString("recycler list", json)
        editor.apply()
    }

    private fun loadData() {
        sharedPreferences = requireContext().getSharedPreferences("shareData", Context.MODE_PRIVATE)
        val gson = Gson()
        val json = sharedPreferences.getString("recycler list", null)
        val type = object : TypeToken<List<PictureItem>>() {}.type

        if (json != null) {
            pictureList = gson.fromJson(json, type)
        }
    }





}