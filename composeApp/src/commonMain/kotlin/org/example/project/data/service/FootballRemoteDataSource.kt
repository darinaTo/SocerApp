package com.example.matches.android.data.service

import com.example.matches.android.data.model.network.football.FootballResponse

class FootballRemoteDataSource(
    private val api: FootballApiService
) {
    suspend fun fetchFootballFixtures(date: String): Result<FootballResponse> {
        return api.getFixtures(date)
    }

    suspend fun fetchLiveMatch(): Result<FootballResponse> {
        return api.getLiveMatch()
    }
}
