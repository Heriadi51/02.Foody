package com.erick.foody

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        val tvViewDetail = findViewById<TextView>(R.id.tv_view_detail)
        val ivBack = findViewById<ImageView>(R.id.iv_back)

        tvViewDetail.setOnClickListener {
            startActivity(Intent(this, DetailTomatoBisque::class.java))
        }
        ivBack.setOnClickListener {
            onBackPressed()
        }
    }
}