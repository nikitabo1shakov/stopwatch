package com.nikitabolshakov.stopwatch.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nikitabolshakov.stopwatch.databinding.ActivityMainBinding
import com.nikitabolshakov.stopwatch.presentation.viewModel.MainActivityViewModel
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val mainActivityViewModel: MainActivityViewModel by inject()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initObserve()
        initListeners()
    }

    private fun initObserve() {
        mainActivityViewModel.ticker.observe(this) {
            binding.textTime.text = it
        }
    }

    private fun initListeners() {
        with(binding) {
            buttonStart.setOnClickListener {
                mainActivityViewModel.stopwatchStart()
            }
            buttonPause.setOnClickListener {
                mainActivityViewModel.stopwatchPause()
            }
            buttonStop.setOnClickListener {
                mainActivityViewModel.stopwatchStop()
            }
        }
    }
}