package com.breezefieldsaleszazuteam.features.nearbyuserlist.api

import com.breezefieldsaleszazuteam.app.Pref
import com.breezefieldsaleszazuteam.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsaleszazuteam.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsaleszazuteam.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}