package com.estudo.domain.usecase


import com.estudo.domain.gateway.RestaurantGateway
import javax.inject.Singleton
import com.estudo.domain.entities.Restaurant as RestaurantRequest

@Singleton
class RestaurantUseCase(
    private val restaurantGateway: RestaurantGateway,
) {

    fun consultRestaurant(id: Long) = restaurantGateway.consultRestaurant(id)
        .let { it }

    fun saveRestaurant(restaurant: RestaurantRequest): RestaurantRequest =
        restaurantGateway.saveRestaurant(restaurant)

    fun deleteRestaurant(id: Long) = restaurantGateway.deleteRestaurant(id)

    fun replaceRestaurant(restaurant: RestaurantRequest): RestaurantRequest =
            restaurantGateway.replaceRestaurant(restaurant)
}