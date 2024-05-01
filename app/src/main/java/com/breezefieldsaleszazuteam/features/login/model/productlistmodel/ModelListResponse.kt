package com.breezefieldsaleszazuteam.features.login.model.productlistmodel

import com.breezefieldsaleszazuteam.app.domain.ModelEntity
import com.breezefieldsaleszazuteam.app.domain.ProductListEntity
import com.breezefieldsaleszazuteam.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}