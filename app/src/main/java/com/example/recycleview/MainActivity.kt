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

        photos.add(Image("https://upload.wikimedia.org/wikipedia/en/d/d3/The_Queen%27s_Gambit.jpg"))
        photos.add(Image("https://static.displate.com/857x1200/displate/2020-01-10/984d8af66d977e48f1d092fa20a27f01_300ac161ed433db245bcb7856dacdf4a.jpg"))
        photos.add(Image("https://pyxis.nymag.com/v1/imgs/098/d6b/1cf5b0130b1203cd01c48057330744cdc9-19-gg-s3.2x.w710.jpg"))
        photos.add(Image("https://i.ebayimg.com/images/g/lVcAAOSwsU5c~8iD/s-l300.jpg"))
        photos.add(Image("https://dobienews.scuc.txed.net/wp-content/uploads/2017/05/img-1.jpg"))
        photos.add(Image("https://m.media-amazon.com/images/M/MV5BMDMzZDkyNzEtYTY5Ni00NzlhLWI4MzUtY2UzNjNmMjI1YzIzXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_.jpg"))
        photos.add(Image("https://target.scene7.com/is/image/Target/GUEST_348575eb-0ec8-49f0-9208-7ab6746af948?wid=488&hei=488&fmt=pjpeg"))
        photos.add(Image("https://cdnb.artstation.com/p/assets/images/images/023/549/847/large/jan-verner-hotovo-witcher.jpg?1579573442"))
        photos.add(Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdpt_JPGHZBdfHKPpYQ7HxsBkrdwPxA6wZFA&usqp=CAU"))
        photos.add(Image("http://oyster.ignimgs.com/mediawiki/apis.ign.com/how-i-met-your-mother/0/0e/HIMYM.jpg"))
        photos.add(Image("https://ae01.alicdn.com/kf/H2ffdaaf62b114a80af631de62981dad1k/Prison-Break-Posters-Movie-Kraft-Paper-Poster-Prints-High-Definition-Clear-Image-Home-Decoration-Livingroom-Bedroom.jpg_960x960.jpg"))
        photos.add(Image("https://upload.wikimedia.org/wikipedia/en/e/e8/Grey%27s_Anatomy_Season_10.jpg"))







        val adapter = ImageAdapter(photos)


        recyclerView.adapter = adapter



        recyclerView.layoutManager = GridLayoutManager(this, 2)

    }
}