package com.example.matches.android.data.service

import com.example.matches.android.data.model.network.football.FootballResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class FootballApiService(private val client: HttpClient) {
    suspend fun getFixtures(date: String): Result<FootballResponse> {
        return try {
            val response: FootballResponse = client.get("fixtures") {
                parameter("date", date)
            }.body<FootballResponse>()
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getLiveMatch(): Result<FootballResponse> {
        return try {
            val response: FootballResponse = client.get("fixtures") {
                parameter("live", "all")
            }.body()
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

