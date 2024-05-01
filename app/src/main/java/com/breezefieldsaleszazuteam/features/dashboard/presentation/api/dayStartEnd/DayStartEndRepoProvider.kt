package com.breezefieldsaleszazuteam.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsaleszazuteam.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsaleszazuteam.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}