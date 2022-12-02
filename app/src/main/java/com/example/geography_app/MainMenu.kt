package com.example.geography_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        setTitle("Главное меню")
    }

    fun themes_btn(view: View) {

        val intent : Intent = Intent (this@MainMenu,Topics_Menu::class.java)
        startActivity(intent)

    }
}