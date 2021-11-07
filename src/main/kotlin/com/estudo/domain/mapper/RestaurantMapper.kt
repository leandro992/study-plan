package com.estudo.domain.mapper

import com.estudo.domain.entities.Restaurant
import com.estudo.application.dataprovider.entities.Restaurant as RestaurantDB
import org.mapstruct.Mapper
import org.mapstruct.Mappings

@Mapper
interface RestaurantMapper {


    @Mappings
    fun toDomain(restaurant: RestaurantDB): Restaurant

    @Mappings
    fun fromDomain(restaurant: Restaurant): RestaurantDB

}