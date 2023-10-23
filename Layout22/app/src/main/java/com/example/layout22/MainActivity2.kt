package com.example.layout22

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val text: TextView = findViewById(R.id.textView)

        val textExtra = intent.getStringExtra("text")
        val textcolor = intent.getIntExtra("color", Color.WHITE)

        text.setText(textExtra)
        text.setTextColor(textcolor)
    }
}
