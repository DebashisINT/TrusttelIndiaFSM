package com.breezefieldsaleszazuteam.features.leaveapplynew

import com.breezefieldsaleszazuteam.features.addAttendence.model.Leave_list_Response


interface ClickonStatus {
    fun OnApprovedclick(obj: Leave_list_Response)
    fun OnRejectclick(obj: Leave_list_Response)
}