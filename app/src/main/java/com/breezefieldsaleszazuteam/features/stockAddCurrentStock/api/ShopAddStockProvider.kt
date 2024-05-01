package com.breezefieldsaleszazuteam.features.stockAddCurrentStock.api

import com.breezefieldsaleszazuteam.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsaleszazuteam.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}