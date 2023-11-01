package com.example.myfamilyspace

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfamilyspace.adapter.VotacionJuegosAdapter
import com.example.myfamilyspace.dataClases.DataClaseJuegos
import com.example.myfamilyspace.databinding.ActivityPantallaVotacionesJuegosBinding

class PantallaVotacionesJuegos : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaVotacionesJuegosBinding
    private val VotacionJuegosAdapter by lazy { VotacionJuegosAdapter() }
    private lateinit var preference: SharedPreferences

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

        mostrarVotacionesJuegos()
    }

    fun mostrarVotacionesJuegos(){
        PreferenceManager.getDefaultSharedPreferences(this)

        val likeCount = preference.getInt("LIKE_COUNT", 0)
        val dislikeCount = preference.getInt("DISLIKE_COUNT", 0)

        val juegosConVotaciones = mutableListOf(
            DataClaseJuegos.SubDataClaseVotacionJuegos("Nombre del Juego 1", likeCount, dislikeCount),
            DataClaseJuegos.SubDataClaseVotacionJuegos("Nombre del Juego 2", likeCount, dislikeCount),
            DataClaseJuegos.SubDataClaseVotacionJuegos("Nombre del Juego 3", likeCount, dislikeCount)
        )

        juegosConVotaciones.sortByDescending { it.cantidadVotacionesLikesJuego }

        val juegosMostrados = juegosConVotaciones.take(3)
        VotacionJuegosAdapter.agregarVotacionJuegos(juegosMostrados)

        binding.pantallaVotacionJuegosRecyclerView.apply{
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = VotacionJuegosAdapter
        }
    }

}