package com.breezefieldsaleszazuteam.features.viewAllOrder.model

import com.breezefieldsaleszazuteam.app.domain.NewOrderColorEntity
import com.breezefieldsaleszazuteam.app.domain.NewOrderGenderEntity
import com.breezefieldsaleszazuteam.app.domain.NewOrderProductEntity
import com.breezefieldsaleszazuteam.app.domain.NewOrderSizeEntity
import com.breezefieldsaleszazuteam.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

