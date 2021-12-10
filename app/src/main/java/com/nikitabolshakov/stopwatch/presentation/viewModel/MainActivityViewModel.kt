package com.nikitabolshakov.stopwatch.presentation.viewModel

import androidx.lifecycle.*
import com.nikitabolshakov.stopwatch.data.TimestampProvider
import com.nikitabolshakov.stopwatch.domain.ElapsedTimeCalculator
import com.nikitabolshakov.stopwatch.domain.StopwatchListOrchestrator
import com.nikitabolshakov.stopwatch.domain.StopwatchStateCalculator
import com.nikitabolshakov.stopwatch.domain.StopwatchStateHolder
import com.nikitabolshakov.stopwatch.utils.TimestampMillisecondsFormatter

class MainActivityViewModel : ViewModel() {

    private val timestampProvider = object : TimestampProvider {
        override fun getMilliseconds(): Long {
            return System.currentTimeMillis()
        }
    }

    private val stopwatchListOrchestrator = StopwatchListOrchestrator(
        StopwatchStateHolder(
            StopwatchStateCalculator(
                timestampProvider,
                ElapsedTimeCalculator(timestampProvider)
            ),
            ElapsedTimeCalculator(timestampProvider),
            TimestampMillisecondsFormatter()
        ),
        viewModelScope
    )

    val ticker: LiveData<String> = stopwatchListOrchestrator.ticker.asLiveData()

    fun stopwatchStart() {
        stopwatchListOrchestrator.start()
    }

    fun stopwatchPause() {
        stopwatchListOrchestrator.pause()
    }

    fun stopwatchStop() {
        stopwatchListOrchestrator.stop()
    }
}