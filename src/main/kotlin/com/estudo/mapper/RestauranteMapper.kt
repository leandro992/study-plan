package com.estudo.mapper

import com.estudo.domain.Restaurante
import com.estudo.dto.RestauranteDTO
import org.mapstruct.Mapper
import org.mapstruct.Mappings

@Mapper
interface RestauranteMapper {

    @Mappings
    fun toDomain(restauranteDTO: RestauranteDTO): Restaurante

}