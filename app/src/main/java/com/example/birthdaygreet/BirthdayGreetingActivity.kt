package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        findViewById<EditText>(R.id.birthdayGreeting).setText("Happy Birthday\n$name!")
    }
}