package com.example.recycleview

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ImageAdapter(private val images: List<Image>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    class ImageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    {


        val ImageView: ImageView = itemView.findViewById(R.id.setImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder



    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_image, parent, false)

        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int)

    {
        val k = images[position]

        Glide.with(holder.ImageView.context)

                .load(k.url)

                .centerCrop()


                .into(holder.ImageView)

    }

    override fun getItemCount(): Int = images.size



}
