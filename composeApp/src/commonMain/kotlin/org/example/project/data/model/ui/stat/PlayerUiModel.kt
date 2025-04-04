package com.example.matches.android.data.model.ui.stat

data class PlayerUiModel(
    val id: String,
    val name: String,
    val imageUrl: String,
    val clubName: String,
    val clubImage: String,
    val stats: PlayerStatsUiModel,
    val cleanSheet: Int,
)
