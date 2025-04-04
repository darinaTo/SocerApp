package org.example.project.data.impl

import com.example.matches.android.data.model.network.football.FootballResponse
import com.example.matches.android.data.network.NetworkResult
import com.example.matches.android.data.repository.FootballRepository
import com.example.matches.android.data.service.FootballRemoteDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class FootballRepositoryImpl (
    private val remoteDataSource: FootballRemoteDataSource
) : FootballRepository {

    override fun getMatchesByDate(data: String): Flow<NetworkResult<FootballResponse>> {
        return flow {
            emit(NetworkResult.Loading)
            runCatching {
                remoteDataSource.fetchFootballFixtures(data).getOrThrow()
            }.onSuccess { matchResponse ->
                emit(NetworkResult.Success(matchResponse))
            }.onFailure { exception ->
                emit(NetworkResult.Error(exception))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun getLiveMatches(): Flow<NetworkResult<FootballResponse>> {
        return flow {
            emit(NetworkResult.Loading)
            runCatching {
                remoteDataSource.fetchLiveMatch().getOrThrow()
            }.onSuccess { matchResponse ->
                emit(NetworkResult.Success(matchResponse))
            }.onFailure { exception ->
                emit(NetworkResult.Error(exception))
            }
        }.flowOn(Dispatchers.IO)
    }
}
