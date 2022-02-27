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
        val email = bundle?.getString("email")
        val phone = bundle?.getString("phone")

        findViewById<TextView>(R.id.textViewName).apply {
            text = name
        }
        findViewById<TextView>(R.id.textViewAge).apply {
            text = age
        }
        findViewById<TextView>(R.id.textViewEmail).apply {
            text = email
        }
        findViewById<TextView>(R.id.textViewPhone).apply {
            text = phone
        }


    }
}