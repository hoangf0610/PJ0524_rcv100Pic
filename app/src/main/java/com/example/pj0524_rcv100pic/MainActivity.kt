package com.example.pj0524_rcv100pic

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pj0524_rcv100pic.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        khởi tạo viewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        tạo ds
        val picList = mutableListOf<PicItem>(
            PicItem("https://wallpaperaccess.com/full/46195.jpg"),
            PicItem("https://wallpaperaccess.com/full/461967.jpg"),
            PicItem("https://wallpaperaccess.com/full/131641.jpg"),
            PicItem("https://wallpaperaccess.com/full/462014.jpg"),
            PicItem("https://wallpaperaccess.com/full/462016.jpg"),
            PicItem("https://wallpaperaccess.com/full/462100.jpg"),
            PicItem("https://wallpaperaccess.com/full/46195.jpg"),
            PicItem("https://wallpaperaccess.com/full/461967.jpg"),
            PicItem("https://wallpaperaccess.com/full/131641.jpg"),
            PicItem("https://wallpaperaccess.com/full/462014.jpg"),
            PicItem("https://wallpaperaccess.com/full/462016.jpg"),
            PicItem("https://wallpaperaccess.com/full/462100.jpg"),
            PicItem("https://wallpaperaccess.com/full/46195.jpg"),
            PicItem("https://wallpaperaccess.com/full/461967.jpg"),
            PicItem("https://wallpaperaccess.com/full/131641.jpg"),
            PicItem("https://wallpaperaccess.com/full/462014.jpg"),
            PicItem("https://wallpaperaccess.com/full/462016.jpg"),
            PicItem("https://wallpaperaccess.com/full/462100.jpg"),
            PicItem("https://wallpaperaccess.com/full/46195.jpg"),
            PicItem("https://wallpaperaccess.com/full/461967.jpg"),
            PicItem("https://wallpaperaccess.com/full/131641.jpg"),
            PicItem("https://wallpaperaccess.com/full/462014.jpg"),
            PicItem("https://wallpaperaccess.com/full/462016.jpg"),
            PicItem("https://wallpaperaccess.com/full/462100.jpg"),
            PicItem("https://wallpaperaccess.com/full/46195.jpg"),
            PicItem("https://wallpaperaccess.com/full/461967.jpg"),
            PicItem("https://wallpaperaccess.com/full/131641.jpg"),
            PicItem("https://wallpaperaccess.com/full/462014.jpg"),
            PicItem("https://wallpaperaccess.com/full/462016.jpg"),
            PicItem("https://wallpaperaccess.com/full/462100.jpg"),
            PicItem("https://wallpaperaccess.com/full/46195.jpg"),
            PicItem("https://wallpaperaccess.com/full/461967.jpg"),
            PicItem("https://wallpaperaccess.com/full/131641.jpg"),
            PicItem("https://wallpaperaccess.com/full/462014.jpg"),
            PicItem("https://wallpaperaccess.com/full/462016.jpg"),
            PicItem("https://wallpaperaccess.com/full/462100.jpg"),
            PicItem("https://wallpaperaccess.com/full/46195.jpg"),
            PicItem("https://wallpaperaccess.com/full/461967.jpg"),
            PicItem("https://wallpaperaccess.com/full/131641.jpg"),
            PicItem("https://wallpaperaccess.com/full/462014.jpg"),
            PicItem("https://wallpaperaccess.com/full/462016.jpg"),
            PicItem("https://wallpaperaccess.com/full/462100.jpg"),
            PicItem("https://wallpaperaccess.com/full/46195.jpg"),
            PicItem("https://wallpaperaccess.com/full/461967.jpg"),
            PicItem("https://wallpaperaccess.com/full/131641.jpg"),
            PicItem("https://wallpaperaccess.com/full/462014.jpg"),
            PicItem("https://wallpaperaccess.com/full/462016.jpg"),
            PicItem("https://wallpaperaccess.com/full/462100.jpg"),

        )

//        render ra màn hình
        val tempAdapter = PicAdapter(picList)
        binding.rcvItem.adapter = tempAdapter
        binding.rcvItem.layoutManager = GridLayoutManager(
            this,
            2,
            LinearLayoutManager.VERTICAL,
            false
        )

//          show ds size ban đầu
        binding.tvLength.text = picList.size.toString()

        binding.btnFilter.setOnClickListener {
//            check odd ban đầu
            tempAdapter.applyOddCheck()

//            lọc và update ds
            val filteredList = picList.filter { it.odd }.toMutableList()
            tempAdapter.updateData(filteredList)

//          show ds size sau update
            binding.tvLength.text = tempAdapter.itemCount.toString()
        }
    }
}