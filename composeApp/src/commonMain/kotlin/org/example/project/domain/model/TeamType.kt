package com.example.matches.android.domain.model

sealed class TeamType {
    data object HOME : TeamType()
    data object AWAY : TeamType()
    data object UNKNOWN : TeamType()
}

fun getEventTeamType(teamName: String, homeTeamName: String, awayTeamName: String): TeamType {
    return when (teamName) {
        homeTeamName -> TeamType.HOME
        awayTeamName -> TeamType.AWAY
        else -> TeamType.UNKNOWN
    }
}
