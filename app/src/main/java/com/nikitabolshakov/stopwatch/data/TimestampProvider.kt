package com.nikitabolshakov.stopwatch.data

interface TimestampProvider {
    fun getMilliseconds(): Long
}