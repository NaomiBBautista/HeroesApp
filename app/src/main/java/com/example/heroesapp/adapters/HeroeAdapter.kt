package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroe
import com.example.heroesapp.models.Publisher
import com.squareup.picasso.Picasso
import org.w3c.dom.Text

class HeroeAdapter(val heroe: List<Heroe>)
    : RecyclerView.Adapter<HeroeViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroeViewHolder {
        // Inflar la vista: contexto (Activity parent), grano de maiz (item), papá, amarrado al activity (False)
        val view = LayoutInflater.from(parent.context).inflate(R.layout.heroe_item, parent, false)
        return HeroeViewHolder(view)
    }

    // Especificar cuantos elementos de la lista hay
    override fun getItemCount(): Int {
        return heroe.count()
    }

    // Encontrar los elementos por ID
    override fun onBindViewHolder(holder: HeroeViewHolder, position: Int) {
        val heroe = heroe[position]
        Picasso.get().load(heroe.image).into(holder.heroeImage)
        holder.heroeName.text = heroe.name
    }

}

class HeroeViewHolder(view: View) : ViewHolder(view){
    // Propiedades con las que trabajaremos
    val heroeName : TextView = view.findViewById(R.id.heroe_name)
    val heroeImage : ImageView = view.findViewById(R.id.heroe_image)
}