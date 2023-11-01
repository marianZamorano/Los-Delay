package com.example.myfamilyspace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfamilyspace.adapter.Peliculas_adapter
import com.example.myfamilyspace.dataClases.Peliculas
class CategoriaRomance : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    private  lateinit var recyclerView: RecyclerView
    private lateinit var Peliculas_adapter: Peliculas_adapter
    private lateinit var listaPeliculas: ArrayList<Peliculas>
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categoria_romance)
        recyclerView = findViewById(R.id.categoria_romance)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        listaPeliculas = ArrayList()

        listaPeliculas.add(Peliculas(R.drawable.boton_juegos, "Yo antes de ti"))
        listaPeliculas.add(Peliculas(R.drawable.boton_juegos, "Titanic"))
        listaPeliculas.add(Peliculas(R.drawable.boton_juegos, "Cuestion de Tiempo"))


        Peliculas_adapter = Peliculas_adapter(listaPeliculas)

        recyclerView.adapter = Peliculas_adapter
    }
}



