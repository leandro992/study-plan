package com.estudo.application.entrypoint

import com.estudo.application.entities.Restaurant
import com.estudo.application.mapper.RestaurantMapper
import com.estudo.domain.usecase.RestaurantUseCase
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put

@Controller(value = "/restaurante")
class RestauranteEntryPoint(
    private val restaurantUseCase: RestaurantUseCase,
    private val restaurantMapper: RestaurantMapper
) {

    @Get("/{id}")
    fun consultRestaurant(@PathVariable id: Long): HttpResponse<Restaurant> =
        restaurantUseCase.consultRestaurant(id)
            .let { restaurantMapper.fromDomain(it) }
            .let { HttpResponse.ok(it) }

    @Post
    fun saveRestaurante(@Body restaurant: Restaurant) =
        restaurantUseCase.saveRestaurant(restaurant)

    @Put
    fun replaceRestaurante(@Body restaurant: Restaurant) =
        restaurantUseCase.replaceRestaurant(restaurant)

    @Delete("/{id}")
    fun deleteRestaurante(@PathVariable id: Long) =
        restaurantUseCase.deleteRestaurant(id)


}