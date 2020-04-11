package com.igo320341.wonders.model

import com.google.gson.annotations.SerializedName

class WonderList {
    @SerializedName("wonders")
    lateinit var wonders: List<Wonder>
}