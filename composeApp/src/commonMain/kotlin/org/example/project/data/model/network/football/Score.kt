package com.example.matches.android.data.model.network.football

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Score(
    @SerialName("fulltime") val fulltime: FulltimeScore,
)
