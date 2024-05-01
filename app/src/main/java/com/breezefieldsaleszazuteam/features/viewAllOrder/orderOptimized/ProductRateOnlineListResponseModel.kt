package com.breezefieldsaleszazuteam.features.viewAllOrder.orderOptimized

import com.breezefieldsaleszazuteam.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsaleszazuteam.base.BaseResponse
import com.breezefieldsaleszazuteam.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}