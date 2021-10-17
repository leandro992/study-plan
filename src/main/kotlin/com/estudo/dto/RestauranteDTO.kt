package com.estudo.dto

import java.math.BigDecimal

data class RestauranteDTO(
    val id: Long,
    val nome: String,
    val taxaFrete: BigDecimal
)