package com.estudo.application.dataprovider.entities

import javax.persistence.*

@Entity
data class PaymentType(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column
    val description: String
)