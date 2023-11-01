package com.example.myfamilyspace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfamilyspace.adapter.JuegosAdapter
import com.example.myfamilyspace.dataClases.DataClaseJuegos
import com.example.myfamilyspace.databinding.ActivityPantallaPrincipalJuegosBinding

class PantallaPrincipalJuegos : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaPrincipalJuegosBinding
    private val JuegosAdapter by lazy { JuegosAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaPrincipalJuegosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.homeButton.setOnClickListener {
            val intent = Intent(this, PantallaPrincipal::class.java)
            startActivity(intent)
        }

        mostrarJuegos()
    }

    fun mostrarJuegos() {
        val monopoly = DataClaseJuegos(
            nombreJuego = "Monopoly",
            imagenJuego = R.drawable.monopoly_icon
        )

        val loba = DataClaseJuegos(
            nombreJuego = "Loba",
            imagenJuego = R.drawable.loba_icon
        )

        val virus = DataClaseJuegos(
            nombreJuego = "Virus",
            imagenJuego = R.drawable.virus_icon
        )

        val uno = DataClaseJuegos(
            nombreJuego = "Uno",
            imagenJuego = R.drawable.uno_card
        )

        val rummikub = DataClaseJuegos(
            nombreJuego = "Rummikub",
            imagenJuego = R.drawable.rumikub_icon
        )

        val sesentaSegundos = DataClaseJuegos(
            nombreJuego = "60 Segundos",
            imagenJuego = R.drawable.sesenta_segundos
        )

        JuegosAdapter.agregarJuegos(listOf(monopoly,loba,virus,uno,rummikub,sesentaSegundos))

        binding.pantallaJuegosRecyclerView.apply{
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = JuegosAdapter
        }
    }

}