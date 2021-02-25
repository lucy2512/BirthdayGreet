package com.parthib.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val message =intent.getStringExtra("message")
        val messageTextView: TextView =findViewById(R.id.textView)
        messageTextView.text="Happy Birthday\n$message!"


    }
}