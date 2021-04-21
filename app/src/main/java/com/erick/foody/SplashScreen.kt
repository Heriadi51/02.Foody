package com.erick.foody

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val startBtn = findViewById<Button>(R.id.start_btn)

        startBtn.setOnClickListener {
            startActivity(Intent(this, HomeScreen::class.java))
        }
    }
}