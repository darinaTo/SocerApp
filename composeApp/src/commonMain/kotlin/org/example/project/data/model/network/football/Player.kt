package com.example.matches.android.data.model.network.football

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Player(
    @SerialName("id") val id: Int? = -1,
    @SerialName("name") val name: String? = "",
)
