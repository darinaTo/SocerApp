package com.example.matches.android.domain.mapper

import com.example.matches.android.data.model.network.football.Event
import com.example.matches.android.data.model.network.football.FootballResponse
import com.example.matches.android.data.model.network.stat.Player
import com.example.matches.android.data.model.network.stat.ShareInfo
import com.example.matches.android.data.model.network.stat.StatResponse
import com.example.matches.android.data.model.ui.matches.FootballMatchItem
import com.example.matches.android.data.model.ui.matches.FootballUiState
import com.example.matches.android.data.model.ui.matches.MatchEventUi
import com.example.matches.android.data.model.ui.stat.PlayerStatsUiModel
import com.example.matches.android.data.model.ui.stat.PlayerUiModel
import com.example.matches.android.data.model.ui.stat.ShareInfoUiModel
import com.example.matches.android.data.model.ui.stat.StatUiModel
import com.example.matches.android.domain.model.EventType
import com.example.matches.android.domain.model.getEventTeamType

fun FootballResponse.mapToFootballUiState(): FootballUiState {
    return FootballUiState(
        isLoading = false,
        fixture = this.fixtures.map { fixtureResponse ->
            val homeTeamName = fixtureResponse.teams.home.name
            val awayTeamName = fixtureResponse.teams.away.name

            FootballMatchItem(
                fixtureId = fixtureResponse.fixture.id,
                leagueId = fixtureResponse.league.id,
                leagueName = fixtureResponse.league.name,
                country = fixtureResponse.league.country,
                timestamp = fixtureResponse.fixture.timestamp,
                venue = fixtureResponse.fixture.venue?.name.orEmpty(),
                referee = fixtureResponse.fixture.referee.orEmpty(),
                flagUrl = if (fixtureResponse.league.flag.isNullOrBlank()) "" else fixtureResponse.league.flag,
                matchDate = fixtureResponse.fixture.date,
                homeTeam = fixtureResponse.teams.home.name,
                awayTeam = fixtureResponse.teams.away.name,
                homeTeamLogo = fixtureResponse.teams.home.logo,
                awayTeamLogo = fixtureResponse.teams.away.logo,
                homeScore = fixtureResponse.goals.home ?: 0,
                awayScore = fixtureResponse.goals.away ?: 0,
                matchStatusShort = fixtureResponse.fixture.status.shortStatus,
                matchStatus = fixtureResponse.fixture.status.longStatus,
                events = fixtureResponse.events?.map { event ->
                    mapEventToMatchEventUi(event, homeTeamName, awayTeamName)
                }
            )
        }
    )
}

fun mapEventToMatchEventUi(event: Event, homeTeamName: String, awayTeamName: String): MatchEventUi {
    val eventType = EventType.fromString(event.type, event.detail)
    val eventTeamType = getEventTeamType(event.team.name, homeTeamName, awayTeamName)
    return MatchEventUi(
        time = event.time.elapsed.toString(),
        type = event.type,
        eventTeamType = eventTeamType,
        iconRes = eventType.drawableResId,
        detail = if (event.detail == "Normal Goal") "Goal" else event.detail,
        eventType = eventType,
        player = event.player.name.orEmpty(),
        assist = event.assist?.name.orEmpty()
    )
}

fun StatResponse.mapToStatUiModel(): StatUiModel {
    return StatUiModel(
        shareInfo = share.mapToShareUiModel(),
        players = player.map { it.mapToPlayerUiModel() }
    )
}

fun ShareInfo.mapToShareUiModel(): ShareInfoUiModel {
    return ShareInfoUiModel(
        title = title,
        description = description,
        url = url
    )
}

fun Player.mapToPlayerUiModel(): PlayerUiModel {
    return PlayerUiModel(
        id = id,
        name = playerName,
        imageUrl = playerImage,
        clubName = clubName ?: "Club name",
        cleanSheet = cleanSheet ?: 0,
        clubImage = clubImage,
        stats = PlayerStatsUiModel(
            cleanSheets = cleanSheet ?:  0,
            goals = goals ?: 0,
            points = points ?: 0.0,
            matches = matches ?: 0,
            goalsPerMatch = goalsPerMatch ?: 0.0,
            appearance = appearance ?: "",
            goalsConceded = goalsConceded ?: 0,
            goalsConcededPerMatch = goalsConcededPerMatch ?: 0.0
        )
    )
}
