package com.plcoding.weatherapp.data.repository

import com.plcoding.weatherapp.data.remote.WeatherApi
import com.plcoding.weatherapp.data.mappers.toWeatherInfo
import com.plcoding.weatherapp.domain.repository.WeatherRepository
import com.plcoding.weatherapp.domain.util.Resource
import com.plcoding.weatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepoImplementation @Inject constructor(
    private val weatherApi: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            val result = weatherApi.getWeatherData(lat, long)
            Resource.Success(result.toWeatherInfo())
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An unknown error occurred")
        }
    }
}