package com.estudo.application.mapper

import com.estudo.application.dataprovider.entities.Restaurant
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings
import org.mapstruct.factory.Mappers
import com.estudo.domain.entities.Restaurant as RestaurantDomain

@Mapper
interface RestaurantMapper {

    @Mappings(
        value = [Mapping(source = "nome", target = "nome"), Mapping(
            source = "freeShipping",
            target = "freeShipping"
        )]
    )
    fun toDomain(restaurant: Restaurant): RestaurantDomain

    @Mappings(
        value = [Mapping(source = "nome", target = "nome"), Mapping(source = "freeShipping", target = "freeShipping")]
    )
    fun fromDomain(restaurant: RestaurantDomain): Restaurant

}