package com.nikitabolshakov.stopwatch.di

import com.nikitabolshakov.stopwatch.presentation.viewModel.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainActivityViewModel = module {
    viewModel { MainActivityViewModel() }
}