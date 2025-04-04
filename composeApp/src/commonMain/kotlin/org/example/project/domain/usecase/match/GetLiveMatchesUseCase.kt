package com.example.matches.android.domain.usecase.match

import com.example.matches.android.data.model.ui.matches.FootballUiState
import com.example.matches.android.data.network.NetworkResult
import com.example.matches.android.data.repository.FootballRepository
import com.example.matches.android.domain.mapper.mapToFootballUiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetLiveMatchesUseCase(
    private val matchRepository: FootballRepository
) {
    fun execute(): Flow<NetworkResult<FootballUiState>> {
        return matchRepository.getLiveMatches()
            .map { result ->
                when (result) {
                    is NetworkResult.Loading -> NetworkResult.Loading
                    is NetworkResult.Success -> {
                        val uiState = result.data.mapToFootballUiState()
                        NetworkResult.Success(uiState)
                    }

                    is NetworkResult.Error -> NetworkResult.Error(result.exception)
                }
            }
    }
}
