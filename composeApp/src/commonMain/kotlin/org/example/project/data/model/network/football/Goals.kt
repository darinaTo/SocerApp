package com.example.matches.android.data.model.network.football

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Goals(
    @SerialName("home") val home: Int? = -1,
    @SerialName("away") val away: Int? = -1,
)
