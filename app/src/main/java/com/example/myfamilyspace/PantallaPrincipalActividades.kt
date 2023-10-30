package com.example.myfamilyspace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfamilyspace.databinding.ActivityPantallaPrincipalActividadesBinding

class PantallaPrincipalActividades : AppCompatActivity() {

    private lateinit var binding: ActivityPantallaPrincipalActividadesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding = ActivityPantallaPrincipalActividadesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.irAPantallaPrincipalBoton.setOnClickListener {
            val intent = Intent(this, PantallaPrincipal::class.java)
            startActivity(intent)
        }
    }
}