package com.estudo.entrypoint

import com.estudo.domain.Restaurante
import com.estudo.service.RestauranteService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put

@Controller(value = "/restaurante")
 class RestauranteEntryPoint(private val restauranteService: RestauranteService) {

    @Get("/{id}")
     fun consultRestaurante(@PathVariable id: Long): HttpResponse<Restaurante> =
            restauranteService.consultaRestaurante(id)
                .let { HttpResponse.ok(it) }

    @Post
     fun saveRestaurante(@Body restaurante: Restaurante) =
        restauranteService.saveRestaurante(restaurante)

    @Put
    fun replaceRestaurante(@Body restaurante: Restaurante) =
        restauranteService.replace(restaurante)

    @Delete("/{id}")
    fun deleteRestaurante(@PathVariable id: Long) =
        restauranteService.delete(id)



}