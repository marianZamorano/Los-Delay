package com.example.myfamilyspace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfamilyspace.adapter.Peliculas_adapter
import com.example.myfamilyspace.dataClases.Peliculas

class CategoriaAccion : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    private  lateinit var recyclerView: RecyclerView
    private lateinit var Peliculas_adapter: Peliculas_adapter
    private lateinit var listaPeliculas: ArrayList<Peliculas>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categoria_accion)
        recyclerView = findViewById(R.id.categoria_accion)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        listaPeliculas = ArrayList()

        listaPeliculas.add(Peliculas(R.drawable.boton_juegos, "espero esto funcione"))
        listaPeliculas.add(Peliculas(R.drawable.boton_juegos, "espero esto funcione"))
        listaPeliculas.add(Peliculas(R.drawable.boton_juegos, "espero esto funcione"))
        listaPeliculas.add(Peliculas(R.drawable.boton_juegos, "espero esto funcione"))
        listaPeliculas.add(Peliculas(R.drawable.boton_juegos, "espero esto funcione"))


        Peliculas_adapter = Peliculas_adapter(listaPeliculas)

        recyclerView.adapter = Peliculas_adapter
    }
}

