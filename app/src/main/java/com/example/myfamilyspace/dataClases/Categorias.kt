package com.example.myfamilyspace.dataClases

data class Categorias(
    val image: Int,
    val name: String,
){
    data class SubDataClaseVotacionPeliculas(
        val tituloPeliculaSub: String,
        val cantidadVotacionesLikesPeliculasSub: Int,
        val cantidadVotacionesDislikesPeLiculasSub: Int
    )
}
