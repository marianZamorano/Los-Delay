package com.example.myfamilyspace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfamilyspace.adapter.VotacionJuegosAdapter
import com.example.myfamilyspace.dataClases.DataClaseJuegos
import com.example.myfamilyspace.databinding.ActivityPantallaVotacionesJuegosBinding

class PantallaVotacionesJuegos : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaVotacionesJuegosBinding
    private val VotacionJuegosAdapter by lazy { VotacionJuegosAdapter() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaVotacionesJuegosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.botonIrPantallaPrincipalVotacionJuegos.setOnClickListener {
            val intent = Intent(this, PantallaPrincipal::class.java)
            startActivity(intent)
        }
        binding.botonVolverAtrasVotacionJuegos.setOnClickListener {
            val intent = Intent(this, PantallaPrincipalJuegos::class.java)
            startActivity(intent)
        }

//        mostrarVotacionesJuegos()
    }

//    fun mostrarVotacionesJuegos(){
//        val primeraJuegoMasVotado = DataClaseJuegos.SubDataClaseVotacionJuegos(
//            nombreJuego = ,
//            cantidadVotacionesLikesJuego = ,
//            cantidadVotacionesDislikesJuego =
//        )
//
//        val segundoJuegoMasVotado = DataClaseJuegos.SubDataClaseVotacionJuegos(
//            nombreJuego = ,
//            cantidadVotacionesLikesJuego = ,
//            cantidadVotacionesDislikesJuego =
//        )
//        val tercerJuegoMasVotado = DataClaseJuegos.SubDataClaseVotacionJuegos(
//            nombreJuego = ,
//            cantidadVotacionesLikesJuego = ,
//            cantidadVotacionesDislikesJuego =
//        )
//
//        VotacionJuegosAdapter.agregarVotacionJuegos(listOf(primeraJuegoMasVotado, segundoJuegoMasVotado, tercerJuegoMasVotado))
//
//        binding.pantallaVotacionJuegosRecyclerView.apply{
//            layoutManager =
//                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
//            adapter = VotacionJuegosAdapter
//        }
//    }

}