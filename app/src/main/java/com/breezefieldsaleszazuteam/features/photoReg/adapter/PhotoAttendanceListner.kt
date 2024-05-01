package com.breezefieldsaleszazuteam.features.photoReg.adapter

import com.breezefieldsaleszazuteam.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}