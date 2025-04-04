package com.example.matches.android.data.model.network.football

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class FootballResponse(
    @SerialName("response") val fixtures: List<Fixture>,
)
