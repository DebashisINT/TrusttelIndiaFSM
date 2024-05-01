package com.breezefieldsaleszazuteam.features.lead.api

import com.breezefieldsaleszazuteam.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsaleszazuteam.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}