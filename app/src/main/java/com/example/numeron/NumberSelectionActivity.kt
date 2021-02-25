package com.example.numeron

import android.app.Activity
import android.os.Bundle
import com.example.numeron.databinding.ActivityNumberSelectionBinding

class NumberSelectionActivity : Activity() {

    private lateinit var binding: ActivityNumberSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // バインディング
        binding = ActivityNumberSelectionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}