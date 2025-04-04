package com.example.matches.android.data.repository

import com.example.matches.android.data.model.network.football.FootballResponse
import com.example.matches.android.data.network.NetworkResult
import kotlinx.coroutines.flow.Flow

interface FootballRepository {
    fun getMatchesByDate(data: String): Flow<NetworkResult<FootballResponse>>

    fun getLiveMatches(): Flow<NetworkResult<FootballResponse>>
}
