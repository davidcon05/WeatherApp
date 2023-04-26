package com.plcoding.weatherapp.data.remote

import retrofit2.http.GET
import com.plcoding.weatherapp.domain.remote.WeatherDto
import retrofit2.http.Query

interface WeatherApi {

    @GET("v1/forecast?hourly=temperature_2m,weathercode,relative_humidity_2m,wind_speed_10m,pressure_msl")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    ): WeatherDto
}