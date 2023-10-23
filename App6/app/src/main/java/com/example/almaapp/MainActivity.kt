package com.example.almaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonId)

        button.setOnClickListener{
            Log.d("MainActivity", "Button pressed")
        }

        button.setOnClickListener{
            Toast.makeText(this, "Button pressed", Toast.LENGTH_SHORT).show();
        }
    }
}