package com.example.matches.android.data.model.network.football

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EventTime(
    @SerialName("elapsed") val elapsed: Int? = -1,
    @SerialName("extra") val extra: Int? = -1,
)
