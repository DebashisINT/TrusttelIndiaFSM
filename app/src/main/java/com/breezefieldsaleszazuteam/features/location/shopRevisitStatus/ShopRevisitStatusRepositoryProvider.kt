package com.breezefieldsaleszazuteam.features.location.shopRevisitStatus

import com.breezefieldsaleszazuteam.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsaleszazuteam.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}