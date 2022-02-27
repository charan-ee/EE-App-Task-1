package com.example.firstappdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendName(view: View) {
        val editText = findViewById<EditText>(R.id.editTextPersonName)
        val editAge = findViewById<EditText>(R.id.editTextAge)

        val name = editText.text.toString()
        val age = editAge.text.toString()

        val bundle = Bundle()
        bundle.putString("name", name)
        bundle.putString("age", age)

        val intent = Intent(this, DisplayNameActivity::class.java).apply {
            putExtras(bundle)
        }
        startActivity(intent)
    }

}