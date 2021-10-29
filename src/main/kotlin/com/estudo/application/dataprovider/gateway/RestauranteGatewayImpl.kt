package com.estudo.application.dataprovider.gateway

import com.estudo.application.dataprovider.RestaurantRepository
import com.estudo.application.entities.Restaurant
import com.estudo.application.mapper.RestaurantMapper
import  com.estudo.domain.entities.Restaurant as RestaurantDomain

import com.estudo.domain.gateway.RestauranteGateway
import javax.inject.Singleton

@Singleton
class RestauranteGatewayImpl(
    private val restaurantRepository: RestaurantRepository,
    private val restaurantMapper: RestaurantMapper
) : RestauranteGateway {

    //    override fun consultRestaurant(id: Long) = restaurantRepository.findById(id)
//        .let { it.get() }
//
//    override fun saveRestaurante(restaurant: Restaurant): Restaurant =
//        restaurantRepository.save(restaurant)
//
//    override fun deleteRestaurant(id: Long) = restaurantRepository.delete(consultRestaurant(id))
//
//    override fun replaceRestaurante(restaurant: Restaurant): Restaurant {
//        return restaurantRepository.update(restaurant)
//    }
    override fun consultRestaurant(id: Long): RestaurantDomain =
        restaurantRepository.findById(id)
            .let { restaurantMapper.toDomain(it.get()) }


    fun saveRestaurant(restaurant: Restaurant): RestaurantDomain =
        restaurantMapper.fromDomain(restaurant)
            .let { restaurantRepository.save(it) }


    override fun deleteRestaurant(id: Long) {
        TODO("Not yet implemented")
    }

    override fun replaceRestaurant(restaurant: com.estudo.domain.entities.Restaurant): com.estudo.domain.entities.Restaurant {
        TODO("Not yet implemented")
    }
}