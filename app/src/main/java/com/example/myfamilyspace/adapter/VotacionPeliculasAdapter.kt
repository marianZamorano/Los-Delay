package com.example.myfamilyspace.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfamilyspace.dataClases.Categorias
import com.example.myfamilyspace.databinding.ItemVotacionPeliculaBinding

class VotacionPeliculasAdapter  : RecyclerView.Adapter<VotacionPeliculasAdapter.VotacionPeliculasAdapterViewHolder>(){

    private var context: Context? = null
    private var listaVotacionPeliculas= mutableListOf<Categorias.SubDataClaseVotacionPeliculas>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VotacionPeliculasAdapter.VotacionPeliculasAdapterViewHolder {
        context = parent.context
        return VotacionPeliculasAdapterViewHolder(
            ItemVotacionPeliculaBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: VotacionPeliculasAdapter.VotacionPeliculasAdapterViewHolder,
        position: Int
    ) {
        holder.binding(listaVotacionPeliculas[position])
    }

    override fun getItemCount(): Int = listaVotacionPeliculas.size

    inner class VotacionPeliculasAdapterViewHolder(val binding: ItemVotacionPeliculaBinding):
            RecyclerView.ViewHolder(binding.root){

                fun binding(subdata: Categorias.SubDataClaseVotacionPeliculas){
                    binding.tituloPeliculaVotacion.text = subdata.tituloPeliculaSub
                    binding.cantidadVotacionesLikesPelicula.text = subdata.cantidadVotacionesLikesPeliculasSub.toString()
                    binding.cantidadVotacionesDislikesPelicula.text = subdata.cantidadVotacionesDislikesPeLiculasSub.toString()
                }
    }

    fun agregarVotacionPeliculas(newDataClaseVotacionPeliculas: List<Categorias.SubDataClaseVotacionPeliculas>){
        listaVotacionPeliculas.clear()
        listaVotacionPeliculas.addAll((newDataClaseVotacionPeliculas))
    }
}