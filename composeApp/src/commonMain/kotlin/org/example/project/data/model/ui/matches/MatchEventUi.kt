package com.example.matches.android.data.model.ui.matches

import com.example.matches.android.domain.model.EventType
import com.example.matches.android.domain.model.TeamType

data class MatchEventUi(
    val time: String,
    val type: String,
    val detail: String?,
    val eventType: EventType,
    val player: String,
    val assist: String,
    val iconRes: Int? = null,
    val eventTeamType: TeamType,
)
