package com.example.matches.android.data.model.ui.matches

data class FootballMatchItem(
    val fixtureId: Int,
    val leagueId: Int,
    val leagueName: String,
    val country: String,
    val flagUrl: String,
    val matchDate: String,
    val homeTeam: String,
    val awayTeam: String,
    val homeTeamLogo: String,
    val awayTeamLogo: String,
    val homeScore: Int,
    val awayScore: Int,
    val matchStatus: String,
    val matchStatusShort: String,
    val events: List<MatchEventUi>?,
    val timestamp: Int,
    val venue: String,
    val referee: String,
)
