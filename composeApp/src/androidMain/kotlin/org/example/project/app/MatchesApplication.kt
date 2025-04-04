package org.example.project.app

import android.app.Application
import androidx.work.Configuration
import org.example.project.di.commonModule
import org.example.project.di.commonModuleUseCase
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.workmanager.factory.KoinWorkerFactory
import org.koin.core.context.startKoin

class MatchesApplication : Application(), Configuration.Provider {
    private val workerFactory: KoinWorkerFactory by lazy { KoinWorkerFactory() }

    override fun onCreate() {
        super.onCreate()

        startKoin {
            printLogger()
            androidContext(this@MatchesApplication)
            modules(commonModule, commonModuleUseCase)
        }
    }

    override val workManagerConfiguration: Configuration
        get() = Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()
}