package com.example.geography_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Topics_Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topics_menu)
        setTitle("Список тем")
    }

    fun topic_atmos(view: View) {

        val intent : Intent = Intent (this@Topics_Menu, topic_atmos::class.java)
        startActivity(intent)
    }
}