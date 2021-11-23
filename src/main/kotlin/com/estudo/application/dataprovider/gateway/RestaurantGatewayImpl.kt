package com.estudo.application.dataprovider.gateway

import com.estudo.application.dataprovider.RestaurantRepository
import com.estudo.application.mapper.RestaurantMapper
import com.estudo.domain.entities.Restaurant
import com.estudo.domain.gateway.RestaurantGateway
import javax.inject.Singleton

@Singleton
class RestaurantGatewayImpl(
    private val restaurantRepository: RestaurantRepository,
    private val restaurantMapper: RestaurantMapper
) : RestaurantGateway {

    override fun consultRestaurant(id: Long): Restaurant =
        restaurantRepository.findById(id)
            .let { RestaurantMapper.INSTANCE.toDomain(it.get()) }

    override fun saveRestaurant(restaurant: Restaurant): Restaurant =
        restaurantMapper.fromDomain(restaurant)
            .let { restaurantRepository.save(it) }
            .let { restaurantMapper.toDomain(it) }

    override fun deleteRestaurant(id: Long) =
        consultRestaurant(id)
            .let { RestaurantMapper.INSTANCE.fromDomain(it) }
            .let { restaurantRepository.delete(it) }

    override fun replaceRestaurant(restaurant: Restaurant): Restaurant =
        RestaurantMapper.INSTANCE.fromDomain(restaurant)
            .let { restaurantRepository.save(it) }
            .let { RestaurantMapper.INSTANCE.toDomain(it) }
}