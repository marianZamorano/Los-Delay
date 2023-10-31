package com.example.myfamilyspace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfamilyspace.databinding.ActivityPantallaPrincipalBinding
import com.example.myfamilyspace.databinding.ActivityPantallaPrincipalPeliculasBinding

class PantallaPrincipalPeliculas : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaPrincipalPeliculasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaPrincipalPeliculasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.botonPantallaPrincipal.setOnClickListener {
            val intent = Intent(this, PantallaPrincipal::class.java)
            startActivity(intent)
        }
    }
}




