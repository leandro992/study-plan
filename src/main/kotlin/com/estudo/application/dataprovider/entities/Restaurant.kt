package com.estudo.application.dataprovider.entities

import java.math.BigDecimal
import javax.persistence.*

@Entity
data class Restaurant(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column
    val nome: String,
    @Column
    val freeShipping: BigDecimal
)