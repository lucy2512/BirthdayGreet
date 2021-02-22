package com.parthib.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val intent=getIntent()
        val name=intent.getStringExtra("name")
        val name1 = findViewById<TextView>(R.id.textView)
        name1.text="Happy Birthday"+ name

    }
}