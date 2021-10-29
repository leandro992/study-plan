package com.estudo.application.dataprovider


import com.estudo.application.entities.Restaurant
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface RestaurantRepository : JpaRepository<Restaurant, Long>