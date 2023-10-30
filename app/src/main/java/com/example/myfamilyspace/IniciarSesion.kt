package com.example.myfamilyspace

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfamilyspace.databinding.ActivityIniciarSesionBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class IniciarSesion : AppCompatActivity() {

    private lateinit var binding: ActivityIniciarSesionBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIniciarSesionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth
        binding.botonIniciarSesion.setOnClickListener {
            iniciarSesion(
                binding.correoElectronicoIniciarSesion.text.toString(),
                binding.contrasenaIniciarSesion.text.toString()
            )
        }
        binding.botonCrearCuenta.setOnClickListener {
            val intent: Intent = Intent(this,CrearCuenta::class.java)
            startActivity(intent)
        }
    }

    fun iniciarSesion(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser
                    val intent = Intent(this, PantallaPrincipal::class.java)
                    startActivity(intent)
                } else {
                    println(email)
                    println(password)
                }
            }
        }
}