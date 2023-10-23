package com.example.layout22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.graphics.Color
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redButton: Button = findViewById<Button>(R.id.redButton)

        redButton.setOnClickListener {
            var i: Intent = Intent(this, MainActivity2::class.java)
            i.putExtra("text", "Red")
            i.putExtra("color", Color.RED)
            startActivity(i)
        }

        val blueButton: Button = findViewById<Button>(R.id.blueButton)

        blueButton.setOnClickListener {
            var i: Intent = Intent(this, MainActivity2::class.java)
            i.putExtra("text", "Blue")
            i.putExtra("color", Color.BLUE)
            startActivity(i)
        }

        val greenButton: Button = findViewById<Button>(R.id.greenButton)

        greenButton.setOnClickListener {
            var i: Intent = Intent(this, MainActivity2::class.java)
            i.putExtra("text", "Green")
            i.putExtra("color", Color.GREEN)
            startActivity(i)
        }

    }
}