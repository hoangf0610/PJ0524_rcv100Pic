package com.example.pj0524_rcv100pic

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.pj0524_rcv100pic.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {

    val imgVM = MutableLiveData<PictureItem>()




    val tvPicVM = MutableLiveData<Int>()
    val oddVM = MutableLiveData<Boolean>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentAll = AllPictureFragment()


        supportFragmentManager.beginTransaction().apply {
//            thay thế framelayout bằng AllPictureFragment
            replace(R.id.flFragment, fragmentAll)
            commit()
        }

        binding.btnFilter.setOnClickListener {
            val fragment = supportFragmentManager.findFragmentById(R.id.flFragment) as? AllPictureFragment
            fragment?.filterOddNumbers()
        }

    }

    fun updateLengthText(size: Int) {
        binding.tvLength.text = size.toString()
    }

    fun  goToDetailFragment(pictureItem: PictureItem) {
        val fragmentDetail = supportFragmentManager.beginTransaction()

//        đóng gói data
        val bundle = Bundle()
        bundle.putString("imgUrl", pictureItem.image)
        bundle.putInt("number", pictureItem.number)
        bundle.putBoolean("odd", pictureItem.odd)
        val detailFragment = DetailPictureFragment()
        detailFragment.arguments = bundle


//        chuyển data
        fragmentDetail.addToBackStack(DetailPictureFragment.TAG)

        fragmentDetail.add(R.id.flFragment, detailFragment)
        fragmentDetail.commit()
    }



}