package com.plcoding.weatherapp.domain.repository

import com.plcoding.weatherapp.domain.util.Resource
import com.plcoding.weatherapp.domain.weather.WeatherInfo

/**
 * Abstracted repo to make it easier to swap out the implementation
 */
interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}