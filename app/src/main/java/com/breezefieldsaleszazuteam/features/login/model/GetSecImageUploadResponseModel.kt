package com.breezefieldsaleszazuteam.features.login.model

import com.breezefieldsaleszazuteam.app.domain.AddShopSecondaryImgEntity


class GetSecImageUploadResponseModel {
    var status:String? = null
    var message:String? = null
    var lead_shop_list: ArrayList<AddShopSecondaryImgEntity>? = null
}