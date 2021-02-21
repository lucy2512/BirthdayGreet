package com.parthib.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun birthdaygreet(view: View) {
        val editText = findViewById<EditText>(R.id.lucy)
        val lucy = editText.text
        Toast.makeText(this,"Name is $lucy",Toast.LENGTH_LONG).show()

        val intent= Intent(this,BirthdayGreetingActivity::class.java )
        startActivity(intent)
    }


}