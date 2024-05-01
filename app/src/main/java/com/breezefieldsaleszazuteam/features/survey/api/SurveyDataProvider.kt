package com.breezefieldsaleszazuteam.features.survey.api

import com.breezefieldsaleszazuteam.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldsaleszazuteam.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}