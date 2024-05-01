package com.breezefieldsaleszazuteam.fcm.api

import com.breezefieldsaleszazuteam.app.Pref
import com.breezefieldsaleszazuteam.base.BaseResponse
import io.reactivex.Observable

/**
 * Created by Saikat on 27-02-2019.
 */
class UpdateDeviceTokenRepo(val apiService: UpdateDeviceTokenApi) {
    fun updateDeviceToken(deviceToken: String): Observable<BaseResponse> {
        return apiService.updateDeviceToken(Pref.user_id!!, Pref.session_token!!, deviceToken, "Android")
    }

}