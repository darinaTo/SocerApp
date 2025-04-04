package com.example.matches.android.domain.usecase.stat

import com.example.matches.android.data.model.ui.stat.StatUiModel
import com.example.matches.android.data.network.NetworkResult
import com.example.matches.android.data.repository.StatRepository
import com.example.matches.android.domain.mapper.mapToStatUiModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetBombardierUseCase(
    private val repository: StatRepository
) {
    fun execute(): Flow<NetworkResult<StatUiModel>> {
        return repository.getBombardier()
            .map { result ->
                when (result) {
                    is NetworkResult.Loading -> NetworkResult.Loading
                    is NetworkResult.Success -> {
                        val uiState = result.data.mapToStatUiModel()
                        NetworkResult.Success(uiState)
                    }
                    is NetworkResult.Error -> NetworkResult.Error(result.exception)
                }
            }
    }
}
