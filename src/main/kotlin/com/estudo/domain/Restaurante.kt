package com.estudo.domain

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Restaurante(
    @Id
    val id: Long,
    @Column
    val nome: String,
    @Column
    val taxaFrete: BigDecimal
)