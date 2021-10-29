package com.estudo.domain.mapper

import com.estudo.domain.entities.Restaurant as RestaurantDomain
import com.estudo.application.entities.Restaurant
import org.mapstruct.Mapper
import org.mapstruct.Mappings

@Mapper
interface RestaurantMapper {


    @Mappings
    fun toDomain(restaurant: Restaurant): RestaurantDomain

    @Mappings
    fun fromDomain(restauranteDomain: RestaurantDomain)

}