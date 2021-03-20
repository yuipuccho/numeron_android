package com.example.numeron

import android.graphics.Typeface
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customFont =  Typeface.createFromAsset(assets, "nikumaru_font.otf")
        val text = findViewById<TextView>(R.id.textView)
        text.typeface = customFont
    }
}
