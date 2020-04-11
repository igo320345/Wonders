package com.igo320341.wonders.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Wonder(@SerializedName("name") val name: String, @SerializedName("pictureUrl") val pictureUrl: String) : Serializable