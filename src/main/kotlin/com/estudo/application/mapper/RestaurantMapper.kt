package com.estudo.application.mapper

import com.estudo.domain.entities.Restaurant as RestaurantDomain
import com.estudo.application.dataprovider.entities.Restaurant
import org.mapstruct.Mapper
import org.mapstruct.Mappings

@Mapper
abstract class RestaurantMapper {

    @Mappings
    abstract fun toDomain(restaurant: Restaurant): RestaurantDomain

    @Mappings
    abstract fun fromDomain(restaurant: RestaurantDomain): Restaurant

}