package com.estudo.domain.entities

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

data class Restaurant(
    val id: Long,
    val nome: String,
    val freeShipping: BigDecimal
)