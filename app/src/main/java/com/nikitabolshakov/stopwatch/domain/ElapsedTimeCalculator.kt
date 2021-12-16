package com.nikitabolshakov.stopwatch.domain

import com.nikitabolshakov.stopwatch.data.TimestampProvider
import com.nikitabolshakov.stopwatch.data.StopwatchState

private const val DEFAULT_TIME = 0L

class ElapsedTimeCalculator(
    private val timestampProvider: TimestampProvider
) {

    fun calculate(state: StopwatchState.Running): Long {
        val currentTimestamp = timestampProvider.getMilliseconds()
        val timePassedSinceStart = if (currentTimestamp > state.startTime) {
            currentTimestamp - state.startTime
        } else {
            DEFAULT_TIME
        }
        return timePassedSinceStart + state.elapsedTime
    }
}