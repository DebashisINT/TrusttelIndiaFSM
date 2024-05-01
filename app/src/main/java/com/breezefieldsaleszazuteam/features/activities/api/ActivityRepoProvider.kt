package com.breezefieldsaleszazuteam.features.activities.api

import com.breezefieldsaleszazuteam.features.member.api.TeamApi
import com.breezefieldsaleszazuteam.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}