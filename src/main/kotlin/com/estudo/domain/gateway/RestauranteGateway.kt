package com.estudo.domain.gateway

import com.estudo.domain.entities.Restaurant as RestaurantDomain
import com.estudo.application.entities.Restaurant


interface RestauranteGateway {

    fun consultRestaurant(id: Long): RestaurantDomain

    fun saveRestaurant(restaurant: Restaurant): RestaurantDomain

    fun deleteRestaurant(id: Long)

    fun replaceRestaurant(restaurant: Restaurant): RestaurantDomain

}