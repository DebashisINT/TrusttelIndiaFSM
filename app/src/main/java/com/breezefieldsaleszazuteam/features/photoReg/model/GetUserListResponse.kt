package com.breezefieldsaleszazuteam.features.photoReg.model

import com.breezefieldsaleszazuteam.features.stockAddCurrentStock.model.CurrentStockGetDataDtls

class GetUserListResponse {
    var status:String ? = null
    var message:String ? = null
    var user_list :ArrayList<UserListResponseModel>? = null
}