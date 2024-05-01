package com.breezefieldsaleszazuteam.features.viewAllOrder.interf

import com.breezefieldsaleszazuteam.app.domain.NewOrderGenderEntity
import com.breezefieldsaleszazuteam.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}