package com.breezefieldsaleszazuteam.features.reimbursement.model

import com.breezefieldsaleszazuteam.base.BaseResponse

/**
 * Created by Saikat on 24-01-2019.
 */
class ReimbursementConfigFetchResponseModel : BaseResponse() {
    var maximum_allowance: String? = null
    var distance: String? = null
    var rate: String? = null
}