package com.example.myfamilyspace.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfamilyspace.dataClases.DataClaseJuegos
import com.example.myfamilyspace.databinding.ItemVotacionJuegoBinding

class VotacionJuegosAdapter  : RecyclerView.Adapter<VotacionJuegosAdapter.VotacionJuegosAdapterViewHolder>(){

    private var context: Context? = null
    private var listaVotacionJuegos= mutableListOf<DataClaseJuegos.SubDataClaseVotacionJuegos>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): VotacionJuegosAdapter.VotacionJuegosAdapterViewHolder{
        context = parent.context
        return VotacionJuegosAdapterViewHolder(
            ItemVotacionJuegoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: VotacionJuegosAdapter.VotacionJuegosAdapterViewHolder,
        position: Int
    ) {
        holder.binding(listaVotacionJuegos[position])
    }

    override fun getItemCount(): Int = listaVotacionJuegos.size

    inner class VotacionJuegosAdapterViewHolder(val binding: ItemVotacionJuegoBinding):
        RecyclerView.ViewHolder(binding.root){

        fun binding(subdata: DataClaseJuegos.SubDataClaseVotacionJuegos){
            binding.nombreJuegoVotacion.text = subdata.nombreJuego
            binding.cantidadVotacionesLikesJuego.text = subdata.cantidadVotacionesLikesJuego.toString()
            binding.cantidadVotacionesDislikesJuego.text = subdata.cantidadVotacionesDislikesJuego.toString()
        }
    }

    fun agregarVotacionJuegos(newDataClaseVotacionPeliculas: List<DataClaseJuegos.SubDataClaseVotacionJuegos>){
        listaVotacionJuegos.clear()
        listaVotacionJuegos.addAll((newDataClaseVotacionPeliculas))
    }
}