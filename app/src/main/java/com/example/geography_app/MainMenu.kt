package com.example.geography_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        setTitle("Главное меню")
    }
}