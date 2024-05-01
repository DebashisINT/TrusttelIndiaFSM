package com.breezefieldsaleszazuteam.features.viewAllOrder.interf

import com.breezefieldsaleszazuteam.app.domain.NewOrderGenderEntity
import com.breezefieldsaleszazuteam.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}