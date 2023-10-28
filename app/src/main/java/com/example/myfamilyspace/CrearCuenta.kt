package com.example.myfamilyspace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.myfamilyspace.databinding.ActivityCrearCuentaBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class CrearCuenta : AppCompatActivity() {

    private lateinit var binding: ActivityCrearCuentaBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCrearCuentaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth
        binding.crearCuentaBoton.setOnClickListener {
            clickCrearCuenta(binding.correoElectronicoCrearCuenta.text.toString(),binding.contrasenaCrearCuenta.text.toString())
        }
    }

    fun clickCrearCuenta(email: String, contrasena: String){
        auth.createUserWithEmailAndPassword(email, contrasena)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val user = auth.currentUser
                    val intent = Intent(this, IniciarSesion ::class.java)
                    startActivity(intent)
                } else {
                    println(email)
                }
            }
    }
}