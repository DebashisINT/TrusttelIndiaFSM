package com.breezefieldsaleszazuteam.features.photoReg.present

import com.breezefieldsaleszazuteam.app.domain.ProspectEntity
import com.breezefieldsaleszazuteam.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}