package com.nikitabolshakov.stopwatch.app

import android.app.Application
import com.nikitabolshakov.stopwatch.di.mainActivityViewModel
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(mainActivityViewModel)
        }
    }
}