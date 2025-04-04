package org.example.project.di

import org.example.project.data.impl.FootballRepositoryImpl
import com.example.matches.android.data.impl.StatRepositoryImpl
import com.example.matches.android.data.repository.FootballRepository
import com.example.matches.android.data.repository.StatRepository
import com.example.matches.android.domain.usecase.match.GetLiveMatchesUseCase
import com.example.matches.android.domain.usecase.match.GetMatchesUseCase
import com.example.matches.android.domain.usecase.stat.GetBombardierUseCase
import com.example.matches.android.domain.usecase.stat.GetGoalkeepersUseCase
import org.koin.dsl.module

val commonModuleUseCase = module {
    factory { GetMatchesUseCase(get()) }
    factory { GetLiveMatchesUseCase(get()) }
    factory { GetBombardierUseCase(get()) }
    factory { GetGoalkeepersUseCase(get()) }
}
val commonModule = module {
    single<FootballRepository> { FootballRepositoryImpl(get()) }
    single<StatRepository> { StatRepositoryImpl(get()) }
}

