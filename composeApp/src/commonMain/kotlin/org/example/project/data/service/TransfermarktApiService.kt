package com.example.matches.android.data.service

import com.example.matches.android.data.model.network.stat.StatResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

class TransfermarktApiService(private val client: HttpClient) {

    suspend fun getBombardier(): Result<StatResponse> {
        return try {
            val response: StatResponse = client.get("statistic/list-golden-boot")
                .body<StatResponse>()
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getGoalKeeper(): Result<StatResponse> {
        return try {
            val response: StatResponse = client.get("statistic/list-clean-sheets")
                .body<StatResponse>()
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
