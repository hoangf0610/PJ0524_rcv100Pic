package com.example.pj0524_rcv100pic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.pj0524_rcv100pic.databinding.FragmentDetailPictureBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

private lateinit var binding: FragmentDetailPictureBinding

@Suppress("UNREACHABLE_CODE", "DEPRECATION")
class DetailPictureFragment : Fragment(R.layout.fragment_detail_picture) {
    private var _binding: FragmentDetailPictureBinding? = null
    private val binding get() = _binding!!

    companion object {
        const val TAG = "DetailPictureFragment"
    }
    var number = 0


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        return super.onCreateView(inflater, container, savedInstanceState)
        _binding = FragmentDetailPictureBinding.inflate(inflater, container, false)
        val view = binding.root

////      nhận data từ AllPictureFragment chuyền sang
        var imgUrl = arguments?.getString("imgUrl")  ?: ""
        number = arguments?.getInt("number") ?: 0

//        ánh xạ view
        Glide.with(this).load(imgUrl).into(binding.imgDetailPic)
        binding.tvDetailNumber.text = number.toString()
        binding.btnDetailPlus.setOnClickListener {
            incrementNumber()
            binding.tvDetailNumber.text = number.toString()
        }
        binding.btnDetailMinus.setOnClickListener {
            decrementNumber()
            binding.tvDetailNumber.text = number.toString()
        }
        binding.btnSubmit.setOnClickListener {
            (activity as MainActivity).imgVM.value = PictureItem( imgUrl, number)
            parentFragmentManager.popBackStack()
        }
        return view
    }

    private fun incrementNumber(): Int {
        number++
        return number
    }

    private fun decrementNumber(): Int {
        number--
        return number
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}