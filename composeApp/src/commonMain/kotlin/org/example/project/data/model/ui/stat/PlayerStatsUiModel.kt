package com.example.matches.android.data.model.ui.stat

data class PlayerStatsUiModel(
    val matches: Int,
    val cleanSheets: Int,
    val goalsPerMatch: Double,
    val points: Double,
    val appearance: String,
    val goalsConceded: Int,
    val goalsConcededPerMatch: Double,
    val goals: Int,
)
