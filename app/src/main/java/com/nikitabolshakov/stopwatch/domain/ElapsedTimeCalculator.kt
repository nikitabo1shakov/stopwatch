package com.nikitabolshakov.stopwatch.domain

import com.nikitabolshakov.stopwatch.data.TimestampProvider
import com.nikitabolshakov.stopwatch.data.StopwatchState

class ElapsedTimeCalculator(
    private val timestampProvider: TimestampProvider
) {

    fun calculate(state: StopwatchState.Running): Long {
        val currentTimestamp = timestampProvider.getMilliseconds()
        val timePassedSinceStart = if (currentTimestamp > state.startTime) {
            currentTimestamp - state.startTime
        } else {
            0
        }
        return timePassedSinceStart + state.elapsedTime
    }
}