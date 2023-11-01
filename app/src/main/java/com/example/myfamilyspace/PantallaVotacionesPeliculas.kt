package com.example.myfamilyspace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfamilyspace.adapter.VotacionPeliculasAdapter
import com.example.myfamilyspace.dataClases.Categorias
import com.example.myfamilyspace.databinding.ActivityPantallaVotacionesPeliculasBinding

class PantallaVotacionesPeliculas : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaVotacionesPeliculasBinding
    private val VotacionPeliculasAdapter by lazy { VotacionPeliculasAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaVotacionesPeliculasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.botonIrPantallaPrincipalVotacionPeliculas.setOnClickListener {
            val intent = Intent(this, PantallaVotacionesPeliculas::class.java)
            startActivity(intent)
        }
        binding.botonVolverAtrasVotacionPeliculas.setOnClickListener {
            val intent = Intent(this, PantallaPrincipalPeliculas::class.java)
            startActivity(intent)
        }

//        mostrarVotacionesPeliculas()
    }

//    fun mostrarVotacionesPeliculas(){
//        val primeraPeliculaMasVotada = Categorias.SubDataClaseVotacionPeliculas(
//            tituloPeliculaSub = ,
//            cantidadVotacionesLikesPeliculasSub = ,
//            cantidadVotacionesDislikesPeLiculasSub =
//        )
//
//        val segundaPeliculaMasVotada = Categorias.SubDataClaseVotacionPeliculas(
//            tituloPeliculaSub = ,
//            cantidadVotacionesLikesPeliculasSub = ,
//            cantidadVotacionesDislikesPeLiculasSub =
//        )
//        val terceraPeliculaMasVotada = Categorias.SubDataClaseVotacionPeliculas(
//            tituloPeliculaSub = ,
//            cantidadVotacionesLikesPeliculasSub = ,
//            cantidadVotacionesDislikesPeLiculasSub =
//        )
//
//        VotacionPeliculasAdapter.agregarVotacionPeliculas(listOf(primeraPeliculaMasVotada, segundaPeliculaMasVotada, terceraPeliculaMasVotada))
//
//        binding.pantallaVotacionPeliculaRecyclerView.apply{
//            layoutManager =
//                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
//            adapter = VotacionPeliculasAdapter
//        }
//    }
}