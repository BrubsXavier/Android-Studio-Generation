package com.example.screenchange


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ciclo", "onCreate")

        val nextButton = findViewById<Button>(R.id.nextButton)
        val secondIntent = Intent(this, SecondActivity::class.java)

        nextButton.setOnClickListener {
            startActivity(secondIntent)
        }
    }
}