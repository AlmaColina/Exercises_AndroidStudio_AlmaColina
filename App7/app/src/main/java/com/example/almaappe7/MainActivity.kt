package com.example.almaappe7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  editText = findViewById<EditText>(R.id.editText);
        val  button = findViewById<Button>(R.id.button);
        val  textView = findViewById<TextView>(R.id.textView);

        button.setOnClickListener {
            val text = editText.getText().toString();
            textView.setText(text);
        }
    }
}

