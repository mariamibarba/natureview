package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val images = ArrayList<Image>()

        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG"))
        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG"))
        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG"))
        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG"))
        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG"))
        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG"))
        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG"))
        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG"))
        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG"))
        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG"))
        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG"))
        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG"))
        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_front.JPG"))
        images.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG/1200px-Mercedes_C-Klasse_%28W203%29_Elegance_20090830_rear.JPG"))




        val adapter = ImageAdapter(images)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter

    }
}