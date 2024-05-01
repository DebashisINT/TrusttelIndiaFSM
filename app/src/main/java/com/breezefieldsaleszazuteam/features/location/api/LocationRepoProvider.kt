package com.breezefieldsaleszazuteam.features.location.api

import com.breezefieldsaleszazuteam.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsaleszazuteam.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}