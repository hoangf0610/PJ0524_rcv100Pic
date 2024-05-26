package com.example.pj0524_rcv100pic

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pj0524_rcv100pic.databinding.ActivityMainBinding
import kotlin.random.Random

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
        val ds = mutableListOf<Item>()
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/131641.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462014.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/46195.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/461967.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462016.jpg", "${Random.nextInt(0, 50)}",true))
        ds.add(Item("https://wallpaperaccess.com/full/462100.jpg", "${Random.nextInt(0, 50)}",true))


//        render ra màn hình
        val adapterm = RvAdapter(ds)
        binding.rcvItem.adapter = adapterm
        binding.rcvItem.layoutManager = GridLayoutManager(
            this,
            2,
            LinearLayoutManager.VERTICAL,
            false
        )

//          show ds size ban đầu
        binding.tvLength.text = ds.size.toString()

        binding.btnFilter.setOnClickListener {
//            đảm bảo tất cả item được check odd
            adapterm.applyOddCheck()

//            lọc và update ds
            val filteredList = ds.filter { it.odd }.toMutableList()
            adapterm.updateData(filteredList)

//          show ds size
            binding.tvLength.text = filteredList.size.toString()
        }
    }
}