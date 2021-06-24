package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {
        val name = findViewById<EditText>(R.id.nameInput).editableText.toString()
        //Toast.makeText(this, "Button was clicked", Toast.LENGTH_LONG).show()
        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}