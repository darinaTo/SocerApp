package com.example.matches.android.data.model.network.stat

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StatResponse(
    @SerialName("share") val share: ShareInfo,
    @SerialName("player") val player: List<Player>,
)
