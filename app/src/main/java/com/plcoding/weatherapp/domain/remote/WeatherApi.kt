package com.plcoding.weatherapp.domain.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    /**
     * This will fetch API data using Kotlin coroutines so we use a suspend fun
     */
    @GET("v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_mslx")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    ): WeatherDto
}