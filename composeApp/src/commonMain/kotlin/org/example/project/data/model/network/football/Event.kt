package org.example.project.data.model.network.football

import com.example.matches.android.data.model.network.football.EventTime
import com.example.matches.android.data.model.network.football.Player
import com.example.matches.android.data.model.network.football.Team
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Event(
    @SerialName("time") val time: EventTime,
    @SerialName("team") val team: Team,
    @SerialName("player") val player: Player,
    @SerialName("assist") val assist: Player? = null,
    @SerialName("type") val type: String,
    @SerialName("detail") val detail: String,
)
