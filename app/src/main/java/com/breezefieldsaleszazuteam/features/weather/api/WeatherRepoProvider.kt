package com.breezefieldsaleszazuteam.features.weather.api

import com.breezefieldsaleszazuteam.features.task.api.TaskApi
import com.breezefieldsaleszazuteam.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}