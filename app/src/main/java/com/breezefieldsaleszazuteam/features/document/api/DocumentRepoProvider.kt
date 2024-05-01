package com.breezefieldsaleszazuteam.features.document.api

import com.breezefieldsaleszazuteam.features.dymanicSection.api.DynamicApi
import com.breezefieldsaleszazuteam.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}