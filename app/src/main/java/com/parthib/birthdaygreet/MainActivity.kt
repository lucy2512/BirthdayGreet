package com.parthib.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var changeActivityButton:Button
    lateinit var messageEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        messageEditText = findViewById(R.id.lucy)
        changeActivityButton =findViewById(R.id.creatBirthdayButton)
        changeActivityButton.setOnClickListener{
            val intent=Intent(this,BirthdayGreetingActivity::class.java)
            val message=messageEditText.text.toString()
            if(message=="") {
                Toast.makeText(this, "Please Enter Name First", Toast.LENGTH_SHORT).show()
            }
            else {
                intent.putExtra("message", message)
                startActivity(intent)
            }
    }






    }


}


