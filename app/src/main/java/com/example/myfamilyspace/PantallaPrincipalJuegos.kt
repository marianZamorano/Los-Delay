package com.example.myfamilyspace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfamilyspace.databinding.ActivityPantallaPrincipalJuegosBinding

class PantallaPrincipalJuegos : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaPrincipalJuegosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantallaPrincipalJuegosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.homeButton.setOnClickListener {
            val intent = Intent(this, PantallaPrincipal::class.java)
            startActivity(intent)
        }
    }

}