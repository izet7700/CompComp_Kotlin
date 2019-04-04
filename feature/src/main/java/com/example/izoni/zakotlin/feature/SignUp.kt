package com.example.izoni.zakotlin.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val actionbar = supportActionBar
        actionbar!!.setDisplayHomeAsUpEnabled(true)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
