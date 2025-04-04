package com.example.matches.android.data.model.network.stat

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ShareInfo(
    @SerialName("title") val title: String,
    @SerialName("url") val url: String,
    @SerialName("description") val description: String,
)
