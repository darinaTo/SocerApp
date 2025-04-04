package com.example.matches.android.data.model.network.football

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class League(
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String,
    @SerialName("country") val country: String,
    @SerialName("logo") val logo: String,
    @SerialName("flag") val flag: String? = "",
    @SerialName("season") val season: Int,
)
