package com.example.myfamilyspace.dataClases

data class DataClaseJuegos(
    val nombreJuego: String,
    val imagenJuego: Int
){
    data class SubDataClaseDescripcion(
        val nombreJuego: String,
        val imagenComoSeJuega: String
    )

    data class SubDataClaseComoSeJuega(
        val nombreJuego: String,
        val textoComoSeJuega: String
    )
}
