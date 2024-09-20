package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class information : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val workout=findViewById<Button>(R.id.work_out_btn)
        workout.setOnClickListener {
            val intent=Intent(this, workout::class.java)
            startActivity(intent)
        }
    }
}