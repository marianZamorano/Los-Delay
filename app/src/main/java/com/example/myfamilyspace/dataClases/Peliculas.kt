package com.example.myfamilyspace.dataClases

data class Peliculas(
    val image: Int,
    val name: String
){
    data class SubDataClaseVotacionPeliculas(
        val tituloPeliculaSub: String,
        val cantidadVotacionesLikesPeliculasub: Int,
        val cantidadVotacionesDislikesPeliculasub: Int
    )
}
