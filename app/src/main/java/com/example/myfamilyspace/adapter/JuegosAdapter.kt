package com.example.myfamilyspace.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfamilyspace.dataClases.DataClaseJuegos
import com.example.myfamilyspace.databinding.ItemActividadActividadesBinding
import com.example.myfamilyspace.databinding.ItemJuegoJuegosBinding

class JuegosAdapter : RecyclerView.Adapter<JuegosAdapter.JuegosAdapterViewHolder>() {

    private var context: Context? = null
    private var listaJuegos= mutableListOf<DataClaseJuegos>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): JuegosAdapter.JuegosAdapterViewHolder {
        context = parent.context
        return JuegosAdapterViewHolder(
            ItemJuegoJuegosBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: JuegosAdapter.JuegosAdapterViewHolder,
        position: Int
    ) {
        holder.binding(listaJuegos[position])
    }

    override fun getItemCount(): Int = listaJuegos.size

    inner class JuegosAdapterViewHolder(val binding: ItemJuegoJuegosBinding) :
            RecyclerView.ViewHolder(binding.root){

                fun binding(data: DataClaseJuegos){
                    binding.imagenJuego.setImageResource(data.imagenJuego)
                    binding.nombreJuego.text = data.nombreJuego
                }
            }

    fun agregarJuegos(newDataClaseJuegos: List<DataClaseJuegos>){
        listaJuegos.clear()
        listaJuegos.addAll((newDataClaseJuegos))
    }
}