package com.breezefieldsaleszazuteam.features.weather.api

import com.breezefieldsaleszazuteam.base.BaseResponse
import com.breezefieldsaleszazuteam.features.task.api.TaskApi
import com.breezefieldsaleszazuteam.features.task.model.AddTaskInputModel
import com.breezefieldsaleszazuteam.features.weather.model.ForeCastAPIResponse
import com.breezefieldsaleszazuteam.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}