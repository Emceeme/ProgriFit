package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button

class posterpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_posterpage)

        val Information = findViewById<Button>(R.id.info_page_btn)
        Information.setOnClickListener {
            val intent=Intent(this, information::class.java)
            startActivity(intent)
        }

        }
    }
