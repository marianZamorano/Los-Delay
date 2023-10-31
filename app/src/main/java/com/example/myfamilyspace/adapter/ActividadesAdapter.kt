package com.example.myfamilyspace.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfamilyspace.R
import com.example.myfamilyspace.dataClases.DataClaseActividades
import com.example.myfamilyspace.databinding.ItemActividadActividadesBinding
import kotlin.random.Random

class ActividadesAdapter : RecyclerView.Adapter<ActividadesAdapter.ActividadesAdapterViewHolder>() {

    private var context: Context? = null
    private var listaActividades = mutableListOf<DataClaseActividades>()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ActividadesAdapterViewHolder {
        context = parent.context
        return ActividadesAdapterViewHolder(
            ItemActividadActividadesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: ActividadesAdapterViewHolder,
        position: Int
    ) {
        holder.binding(listaActividades[position])
        holder.binding.fondoActividadActividades.setBackgroundColor(holder.itemView.resources.getColor(getRandomColor(), null))
    }

    private fun getRandomColor(): Int {
        val colorCode = mutableListOf<Int>()
        colorCode.add(R.color.lilaclaro)
        colorCode.add(R.color.verdeTurquesaClaro)
        colorCode.add(R.color.aquamarine)
        colorCode.add(R.color.lightSkyBlue)
        colorCode.add(R.color.violet)
        colorCode.add(R.color.verdeAmarillo)
        val numero = Random.nextInt(colorCode.size)
        return colorCode.get(numero)

    }

    override fun getItemCount(): Int = listaActividades.size

    inner class ActividadesAdapterViewHolder(val binding: ItemActividadActividadesBinding) :
        RecyclerView.ViewHolder(binding.root){
        fun binding(data: DataClaseActividades){
            binding.tituloActividad.text = data.titulo
            binding.fecha.text = data.fecha
            binding.horaInicial.text = data.horaInicial
            binding.horaFinal.text = data.horaFinal
        }
    }

    fun agregarActividades(newDataClaseActividades: List<DataClaseActividades>){
        listaActividades.clear()
        listaActividades.addAll(newDataClaseActividades)
    }
}