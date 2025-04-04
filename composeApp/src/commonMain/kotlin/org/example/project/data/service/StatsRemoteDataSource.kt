package com.example.matches.android.data.service

import com.example.matches.android.data.model.network.stat.StatResponse

class StatsRemoteDataSource(
    private val api: TransfermarktApiService
) {
    suspend fun fetchBombardier(): Result<StatResponse> {
        return api.getBombardier()
    }

    suspend fun fetchGoalKeeper(): Result<StatResponse> {
        return api.getGoalKeeper()
    }
}
