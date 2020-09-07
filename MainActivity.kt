package com.example.attempt2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_data_entry__page.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addsessionbtn = findViewById<Button>(R.id.addsessionbtn)
        addsessionbtn.setOnClickListener{
            val intent = Intent(this,dataentrypage::class.java)
            startActivity(intent)
        }

    }
}