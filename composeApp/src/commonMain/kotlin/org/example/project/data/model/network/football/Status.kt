package com.example.matches.android.data.model.network.football

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Status(
    @SerialName("long") val longStatus: String,
    @SerialName("short") val shortStatus: String,
)
