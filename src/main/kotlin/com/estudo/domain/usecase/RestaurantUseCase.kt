package com.estudo.domain.usecase

import com.estudo.domain.gateway.RestaurantGateway
import javax.inject.Singleton
import com.estudo.domain.entities.Restaurant

@Singleton
class RestaurantUseCase(
    private val restaurantGateway: RestaurantGateway
) {

    fun consultRestaurant(id: Long) =
        restaurantGateway.consultRestaurant(id)

    fun saveRestaurant(restaurant: Restaurant): Restaurant =
        restaurantGateway.saveRestaurant(restaurant)

    fun deleteRestaurant(id: Long) = restaurantGateway.deleteRestaurant(id)

    fun replaceRestaurant(restaurant: Restaurant): Restaurant =
        restaurantGateway.replaceRestaurant(restaurant)
}