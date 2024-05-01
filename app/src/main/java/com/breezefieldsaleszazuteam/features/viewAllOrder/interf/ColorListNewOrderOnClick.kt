package com.breezefieldsaleszazuteam.features.viewAllOrder.interf

import com.breezefieldsaleszazuteam.app.domain.NewOrderColorEntity
import com.breezefieldsaleszazuteam.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}