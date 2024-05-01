package com.breezefieldsaleszazuteam.features.dymanicSection.api

import com.breezefieldsaleszazuteam.features.dailyPlan.api.PlanApi
import com.breezefieldsaleszazuteam.features.dailyPlan.api.PlanRepo

/**
 * Created by Saikat on 19-Aug-20.
 */
object DynamicRepoProvider {
    fun dynamicRepoProvider(): DynamicRepo {
        return DynamicRepo(DynamicApi.create())
    }

    fun dynamicRepoProviderMultipart(): DynamicRepo {
        return DynamicRepo(DynamicApi.createImage())
    }
}