package com.breezefieldsaleszazuteam.features.viewAllOrder.interf

import com.breezefieldsaleszazuteam.app.domain.NewOrderGenderEntity
import com.breezefieldsaleszazuteam.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}