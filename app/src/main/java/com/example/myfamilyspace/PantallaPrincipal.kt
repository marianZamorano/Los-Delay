package com.example.myfamilyspace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfamilyspace.databinding.ActivityPantallaPrincipalBinding

class PantallaPrincipal : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaPrincipalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.botonActividades.setOnClickListener {
            val intent = Intent(this, PantallaPrincipalActividades::class.java)
            startActivity(intent)
        }
        binding.botonPeliculas.setOnClickListener {
            val intent = Intent(this, PantallaPrincipalPeliculas::class.java)
            startActivity(intent)
        }
        binding.botonJuegos.setOnClickListener {
            val intent = Intent(this, PantallaPrincipalJuegos::class.java)
            startActivity(intent)
        }
    }
}