package com.example.myfamilyspace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfamilyspace.adapter.Peliculas_adapter
import com.example.myfamilyspace.dataClases.Peliculas

class CategoriaFiccion : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    private  lateinit var recyclerView: RecyclerView
    private lateinit var Peliculas_adapter: Peliculas_adapter
    private lateinit var listaPeliculas: ArrayList<Peliculas>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categoria_ficcion)
        recyclerView = findViewById(R.id.categoria_ficcion)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        listaPeliculas = ArrayList()

        listaPeliculas.add(Peliculas(R.drawable.boton_juegos, "DUNE"))
        listaPeliculas.add(Peliculas(R.drawable.boton_juegos, "Avengers Infinity War"))
        listaPeliculas.add(Peliculas(R.drawable.boton_juegos, "The Simpsons"))


        Peliculas_adapter = Peliculas_adapter(listaPeliculas)

        recyclerView.adapter = Peliculas_adapter
    }
}






