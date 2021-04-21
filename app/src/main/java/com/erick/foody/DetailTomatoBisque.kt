package com.erick.foody

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DetailTomatoBisque : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tomato_bisque)
    }

    override fun onStart() {
        super.onStart()
        val ivBackDesc = findViewById<ImageView>(R.id.iv_back_desc)
        ivBackDesc.setOnClickListener {
            onBackPressed()
        }
    }
}