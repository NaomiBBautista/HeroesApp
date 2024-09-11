package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso

class PublisherAdapter(val publisher: List<Publisher>)
    : RecyclerView.Adapter<PublisherViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
        // Inflar la vista: contexto (Activity parent), grano de maiz (item), papá, amarrado al activity (False)
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item, parent, false)
        return PublisherViewHolder(view)
    }

    // Especificar cuantos elementos de la lista hay
    override fun getItemCount(): Int {
        return publisher.count()
    }

    // Encontrar los elementos por ID
    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val publisher = publisher[position]
        Picasso.get().load(publisher.image).into(holder.publisherImage)
    }

}

class PublisherViewHolder(view: View) : ViewHolder(view){
    // Propiedades con las que trabajaremos
    val publisherImage : ImageView = view.findViewById(R.id.publisher_image)
}