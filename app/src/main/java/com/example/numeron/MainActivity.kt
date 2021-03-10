package com.example.numeron

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.numeron.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // バインディング
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // ボタンタップ
        binding.toNumberSelection.setOnClickListener{ toNumberSelection() }
    }

    private fun toNumberSelection() {
        val intent = Intent(this, NumberSelectionActivity::class.java)
        startActivity(intent)
    }
}
