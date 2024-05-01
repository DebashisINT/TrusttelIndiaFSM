package com.breezefieldsaleszazuteam.features.viewAllOrder.interf

import com.breezefieldsaleszazuteam.app.domain.NewOrderProductEntity
import com.breezefieldsaleszazuteam.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}