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

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)




        recyclerView = findViewById(R.id.recyclerView)


        val photos = ArrayList<Image>()

        photos.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Waaierbuisjeszwam_%28Polyporus_varius%29_op_een_dode_lijsterbes_%28Sorbus%29._Locatie._Natuurterrein_De_Famberhorst._08-07-2019._%28d.j.b%29._03-05.jpg/1024px-Waaierbuisjeszwam_%28Polyporus_varius%29_op_een_dode_lijsterbes_%28Sorbus%29._Locatie._Natuurterrein_De_Famberhorst._08-07-2019._%28d.j.b%29._03-05.jpg"))
        photos.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Tarvasj%C3%B5gi.jpg/1280px-Tarvasj%C3%B5gi.jpg"))
        photos.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Waaierbuisjeszwam_%28Polyporus_varius%29_op_een_dode_lijsterbes_%28Sorbus%29._Locatie._Natuurterrein_De_Famberhorst._08-07-2019._%28d.j.b%29._03-05.jpg/1024px-Waaierbuisjeszwam_%28Polyporus_varius%29_op_een_dode_lijsterbes_%28Sorbus%29._Locatie._Natuurterrein_De_Famberhorst._08-07-2019._%28d.j.b%29._03-05.jpg"))
        photos.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Tarvasj%C3%B5gi.jpg/1280px-Tarvasj%C3%B5gi.jpg"))
        photos.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Waaierbuisjeszwam_%28Polyporus_varius%29_op_een_dode_lijsterbes_%28Sorbus%29._Locatie._Natuurterrein_De_Famberhorst._08-07-2019._%28d.j.b%29._03-05.jpg/1024px-Waaierbuisjeszwam_%28Polyporus_varius%29_op_een_dode_lijsterbes_%28Sorbus%29._Locatie._Natuurterrein_De_Famberhorst._08-07-2019._%28d.j.b%29._03-05.jpg"))
        photos.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Tarvasj%C3%B5gi.jpg/1280px-Tarvasj%C3%B5gi.jpg"))
        photos.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9f/Waaierbuisjeszwam_%28Polyporus_varius%29_op_een_dode_lijsterbes_%28Sorbus%29._Locatie._Natuurterrein_De_Famberhorst._08-07-2019._%28d.j.b%29._03-05.jpg/1024px-Waaierbuisjeszwam_%28Polyporus_varius%29_op_een_dode_lijsterbes_%28Sorbus%29._Locatie._Natuurterrein_De_Famberhorst._08-07-2019._%28d.j.b%29._03-05.jpg"))
        photos.add(Image("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Tarvasj%C3%B5gi.jpg/1280px-Tarvasj%C3%B5gi.jpg"))


        val adapter = ImageAdapter(photos)


        recyclerView.adapter = adapter



        recyclerView.layoutManager = GridLayoutManager(this, 2)

    }
}