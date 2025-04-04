package com.example.matches.android.data.model.network.stat

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Player(
    @SerialName("id") val id: String,
    @SerialName("playerName") val playerName: String,
    @SerialName("points") val points: Double? = -1.0,
    @SerialName("playerImage") val playerImage: String,
    @SerialName("countryImage") val countryImage: String,
    @SerialName("clubName") val clubName: String? = "",
    @SerialName("clubImage") val clubImage: String,
    @SerialName("competitionName") val competitionName: String? = "",
    @SerialName("appearance") val appearance: String? = "",
    @SerialName("minutes") val minutes: Int? = -1,
    @SerialName("goalsConceded") val goalsConceded: Int? = -1,
    @SerialName("goals") val goals: Int? = -1,
    @SerialName("cleanSheet") val cleanSheet: Int? = -1,
    @SerialName("matches") val matches: Int? = -1,
    @SerialName("goalsPerMatch") val goalsPerMatch: Double? = -1.0,
    @SerialName("goalsConcededPerMatch") val goalsConcededPerMatch: Double? = -1.0,
    @SerialName("averageGoalsConceded") val averageGoalsConceded: Double? = -1.0,
    @SerialName("goalsConcededPerMinute") val goalsConcededPerMinute: Double? = -1.0,
)
