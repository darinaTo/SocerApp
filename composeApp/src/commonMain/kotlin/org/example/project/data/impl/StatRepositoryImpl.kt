package com.example.matches.android.data.impl

import com.example.matches.android.data.model.network.stat.StatResponse
import com.example.matches.android.data.network.NetworkResult
import com.example.matches.android.data.repository.StatRepository
import com.example.matches.android.data.service.StatsRemoteDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class StatRepositoryImpl(
    private val remoteDataSource: StatsRemoteDataSource
) : StatRepository {

    override fun getBombardier(): Flow<NetworkResult<StatResponse>> {
        return flow {
            emit(NetworkResult.Loading)
            runCatching {
                remoteDataSource.fetchBombardier().getOrThrow()
            }.onSuccess { matchResponse ->
                emit(NetworkResult.Success(matchResponse))
            }.onFailure { exception ->
                emit(NetworkResult.Error(exception))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun getGoalKeeper(): Flow<NetworkResult<StatResponse>> {
        return flow {
            emit(NetworkResult.Loading)
            runCatching {
                remoteDataSource.fetchGoalKeeper().getOrThrow()
            }.onSuccess { matchResponse ->
                emit(NetworkResult.Success(matchResponse))
            }.onFailure { exception ->
                emit(NetworkResult.Error(exception))
            }
        }.flowOn(Dispatchers.IO)
    }
}
