package com.weather.weathermain.domain.interactor

import com.weather.weathermain.domain.repository.IWeatherRepository

interface IWeatherInteractor {
    companion object {
        fun getInstance(weather: IWeatherRepository = IWeatherRepository.getInstance()) = WeatherInteractor(weather)
    }
}

class WeatherInteractor (private val weatherRepository: IWeatherRepository): IWeatherInteractor { }