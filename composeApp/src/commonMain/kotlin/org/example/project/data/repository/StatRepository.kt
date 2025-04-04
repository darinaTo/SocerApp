package com.example.matches.android.data.repository

import com.example.matches.android.data.model.network.stat.StatResponse
import com.example.matches.android.data.network.NetworkResult
import kotlinx.coroutines.flow.Flow

interface StatRepository {
    fun getBombardier(): Flow<NetworkResult<StatResponse>>

    fun getGoalKeeper(): Flow<NetworkResult<StatResponse>>
}
