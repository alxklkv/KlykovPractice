package com.example.geography_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("География 5-й класс")
    }

    fun Mainwindowbtn(view: View) {

        val intent : Intent = Intent (this@MainActivity,MainMenu::class.java)
        startActivity(intent)

    }
}