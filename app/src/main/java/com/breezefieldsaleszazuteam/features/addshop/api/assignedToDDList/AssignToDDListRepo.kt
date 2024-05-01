package com.breezefieldsaleszazuteam.features.addshop.api.assignedToDDList

import com.breezefieldsaleszazuteam.app.Pref
import com.breezefieldsaleszazuteam.features.addshop.model.assigntoddlist.AssignToDDListResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 03-10-2018.
 */
class AssignToDDListRepo(val apiService: AssignToDDListApi) {
    fun assignToDDList(state_id: String): Observable<AssignToDDListResponseModel> {
        return apiService.getAssignedToDDList(Pref.session_token!!, Pref.user_id!!, state_id)
    }
}