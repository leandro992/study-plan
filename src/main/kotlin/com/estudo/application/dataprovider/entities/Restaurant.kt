package com.estudo.application.dataprovider.entities

import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.GenerationType
import javax.persistence.GeneratedValue
import javax.persistence.Column

@Entity
@Table
data class Restaurant(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column
    val nome: String,
    @Column
    val freeShipping: Double
)