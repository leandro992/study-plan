package com.estudo.domain.gateway

import com.estudo.domain.entities.Restaurant


interface RestaurantGateway {

    fun consultRestaurant(id: Long): Restaurant

    fun saveRestaurant(restaurant: Restaurant): Restaurant

    fun deleteRestaurant(id: Long)

    fun replaceRestaurant(restaurant: Restaurant): Restaurant
}