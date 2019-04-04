package com.example.izoni.zakotlin.feature

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signUpBtn : Button = findViewById(R.id.signUpButton)
        signUpBtn.setOnClickListener{
            val intent=Intent(this, SignUp :: class.java)
            startActivity(intent)
        }

    }
}
