package com.estudo.domain.usecase


import com.estudo.domain.entities.Restaurant as RestauranteDomain
import com.estudo.application.entities.Restaurant
import com.estudo.domain.gateway.RestauranteGateway
import com.estudo.domain.mapper.RestaurantMapper
import javax.inject.Singleton

@Singleton
class RestaurantUseCase(
    private val restauranteGateway: RestauranteGateway,
    private val restaurantMapper: RestaurantMapper
) {

    fun consultRestaurant(id: Long) = restauranteGateway.consultRestaurant(id)
        .let { it }

    fun saveRestaurant(restaurant: Restaurant): RestauranteDomain =
        restaurantMapper.toDomain(restaurant)
            .let { restauranteGateway.saveRestaurant(it) }

    fun deleteRestaurant(id: Long) = restauranteGateway.deleteRestaurant(id)

    fun replaceRestaurant(restaurant: Restaurant): RestauranteDomain =
        restaurantMapper.toDomain(restaurant)
            .let { restauranteGateway.replaceRestaurant(it) }


}