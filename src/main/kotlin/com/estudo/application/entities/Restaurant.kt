package com.estudo.application.entities

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Restaurant(
    @Id
    val id: Long,
    @Column
    val nome: String,
    @Column
    val taxaFrete: BigDecimal
)