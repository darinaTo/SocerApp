package com.example.matches.android.data.model.network.football

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FixtureDetails(
    @SerialName("id") val id: Int,
    @SerialName("date") val date: String,
    @SerialName("status") val status: Status,
    @SerialName("timestamp") val timestamp: Int,
    @SerialName("venue") val venue: Venue? = null,
    @SerialName("referee") val referee: String? = "",
)
