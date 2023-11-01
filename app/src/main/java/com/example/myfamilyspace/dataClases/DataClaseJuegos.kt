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

    data class SubDataClaseVotacionJuegos(
        val nombreJuego: String,
        val cantidadVotacionesLikesJuego: Int,
        val cantidadVotacionesDislikesJuego: Int
    )
}
