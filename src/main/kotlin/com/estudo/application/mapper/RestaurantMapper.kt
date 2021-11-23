package com.estudo.application.mapper

import com.estudo.application.dataprovider.entities.Restaurant
import org.mapstruct.Mapper
import org.mapstruct.Mappings
import org.mapstruct.factory.Mappers
import com.estudo.domain.entities.Restaurant as RestaurantDomain

@Mapper
interface RestaurantMapper {
    @Mappings
    fun toDomain(restaurant: Restaurant): RestaurantDomain

    @Mappings
    fun fromDomain(restaurant: RestaurantDomain): Restaurant

    companion object {
         val INSTANCE: RestaurantMapper = Mappers.getMapper(RestaurantMapper::class.java)
    }

}