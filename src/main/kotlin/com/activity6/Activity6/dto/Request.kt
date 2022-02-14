package com.activity6.Activity6.dto

import com.activity6.Activity6.model.Blood
import com.activity6.Activity6.model.BloodBank
import com.activity6.Activity6.model.Donor

data class Request(
    var donor: Donor,
    var blood: Blood,
    var bloodBank: BloodBank
)