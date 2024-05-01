package com.breezefieldsaleszazuteam.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsaleszazuteam.app.FileUtils
import com.breezefieldsaleszazuteam.app.Pref
import com.breezefieldsaleszazuteam.base.BaseResponse
import com.breezefieldsaleszazuteam.features.addshop.model.AddLogReqData
import com.breezefieldsaleszazuteam.features.addshop.model.AddShopRequestData
import com.breezefieldsaleszazuteam.features.addshop.model.AddShopResponse
import com.breezefieldsaleszazuteam.features.addshop.model.LogFileResponse
import com.breezefieldsaleszazuteam.features.addshop.model.UpdateAddrReq
import com.breezefieldsaleszazuteam.features.contacts.CallHisDtls
import com.breezefieldsaleszazuteam.features.contacts.CompanyReqData
import com.breezefieldsaleszazuteam.features.contacts.ContactMasterRes
import com.breezefieldsaleszazuteam.features.contacts.SourceMasterRes
import com.breezefieldsaleszazuteam.features.contacts.StageMasterRes
import com.breezefieldsaleszazuteam.features.contacts.StatusMasterRes
import com.breezefieldsaleszazuteam.features.contacts.TypeMasterRes
import com.breezefieldsaleszazuteam.features.dashboard.presentation.DashboardActivity
import com.breezefieldsaleszazuteam.features.login.model.WhatsappApiData
import com.breezefieldsaleszazuteam.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}