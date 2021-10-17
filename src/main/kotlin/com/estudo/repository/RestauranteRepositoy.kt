package com.estudo.repository

import com.estudo.domain.Restaurante
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface RestauranteRepositoy : JpaRepository<Restaurante, Long>