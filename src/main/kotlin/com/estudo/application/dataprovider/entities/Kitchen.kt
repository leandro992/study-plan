package com.estudo.application.dataprovider.entities

import javax.persistence.*

@Entity
data class Kitchen(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column
    val name: String
)