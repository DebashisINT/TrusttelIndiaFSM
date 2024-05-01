package com.breezefieldsaleszazuteam.features.newcollectionreport

import com.breezefieldsaleszazuteam.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}