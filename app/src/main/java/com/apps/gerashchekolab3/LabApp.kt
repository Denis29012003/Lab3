package com.apps.gerashchekolab3

import android.app.Application
import com.apps.gerashchekolab3.ui.viewmodel.FirstViewModel
import com.apps.gerashchekolab3.ui.viewmodel.RecycleViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class LabApp:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@LabApp)
            androidLogger()
            modules(myModule)
        }

    }

    private val myModule = module {
        viewModel { RecycleViewModel(get()) }
    }
}