package com.plcoding.weatherapp.data.remote

import com.squareup.moshi.Json
import retrofit2.http.GET

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)
