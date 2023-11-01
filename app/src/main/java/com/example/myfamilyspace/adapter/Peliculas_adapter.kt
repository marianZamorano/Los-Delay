package com.example.myfamilyspace.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfamilyspace.R
import com.example.myfamilyspace.dataClases.Peliculas

class Peliculas_adapter(private val listaPeliculas:ArrayList<Peliculas>)
: RecyclerView.Adapter<Peliculas_adapter.CategoriasViewHolder>() {

    class CategoriasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imagen_pelicula)
        val textView: TextView = itemView.findViewById(R.id.nombre_pelicula)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriasViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_peliculas, parent, false)
        return CategoriasViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listaPeliculas.size
    }

    override fun onBindViewHolder(holder: CategoriasViewHolder, position: Int) {
        val categorias = listaPeliculas[position]
        holder.imageView.setImageResource(categorias.image)
        holder.textView.text = categorias.name

    }
}
