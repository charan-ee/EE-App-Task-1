package com.example.firstappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_name)

        val bundle = intent.extras

        val name = bundle?.getString("name")
        val age = bundle?.getString("age")

        val textViewName = findViewById<TextView>(R.id.textViewName).apply {
            text = name
        }
        val textViewAge = findViewById<TextView>(R.id.textViewAge).apply {
            text = age
        }


    }
}