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

        Toast.makeText(this,"Great!",Toast.LENGTH_LONG).show()
        val nameInput=main
        val intent= Intent(this,BirthdayGreetingActivity::class.java )
        startActivity(intent)
    }


}