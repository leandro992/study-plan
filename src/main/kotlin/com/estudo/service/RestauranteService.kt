package com.estudo.service

import com.estudo.domain.Restaurante
import com.estudo.repository.RestauranteRepositoy
import javax.inject.Singleton

@Singleton
class RestauranteService(
    private val restauranteRepositoy: RestauranteRepositoy,
) {

    fun consultaRestaurante(id: Long) = restauranteRepositoy.findById(id)
        .let { it.get() }

    fun saveRestaurante(restaurante: Restaurante): Restaurante =
        restauranteRepositoy.save(restaurante)

    fun delete(id: Long) = restauranteRepositoy.delete(consultaRestaurante(id))

    fun replace(restaurante: Restaurante): Restaurante {
        return restauranteRepositoy.update(restaurante)
    }

}