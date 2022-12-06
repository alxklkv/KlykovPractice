package com.example.geography_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent (this@Splashscreen, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}