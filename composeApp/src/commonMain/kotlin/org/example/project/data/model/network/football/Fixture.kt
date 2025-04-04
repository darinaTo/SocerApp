package com.example.matches.android.data.model.network.football

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.example.project.data.model.network.football.Event

@Serializable
data class Fixture(
    @SerialName("fixture") val fixture: FixtureDetails,
    @SerialName("league") val league: League,
    @SerialName("teams") val teams: Teams,
    @SerialName("goals") val goals: Goals,
    @SerialName("score") val score: Score,
    @SerialName("events") val events: List<Event>? = emptyList(),
)
