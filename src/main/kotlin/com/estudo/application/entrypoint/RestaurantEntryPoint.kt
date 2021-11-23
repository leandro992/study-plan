package com.estudo.application.entrypoint

import com.estudo.domain.entities.Restaurant
import com.estudo.domain.usecase.RestaurantUseCase
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put

@Controller(value = "/restaurant")
class RestaurantEntryPoint(
    private val restaurantUseCase: RestaurantUseCase
) {

    @Get("/{id}")
    fun consultRestaurant(@PathVariable id: Long): HttpResponse<Restaurant> =
        restaurantUseCase.consultRestaurant(id)
            .let { HttpResponse.ok(it) }

    @Post
    fun saveRestaurant(@Body restaurant: Restaurant) =
        restaurantUseCase.saveRestaurant(restaurant)

    @Put
    fun replaceRestaurant(@Body restaurant: Restaurant) =
        restaurantUseCase.replaceRestaurant(restaurant)

    @Delete("/{id}")
    fun deleteRestaurant(@PathVariable id: Long) =
        restaurantUseCase.deleteRestaurant(id)
}