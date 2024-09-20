package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        // Use Handler to post a delayed Runnable
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity, posterpage::class.java)
            startActivity(intent)
            finish() // Optional: Call finish() to remove MainActivity from the back stack
        }, 3000) // Delay for 3000 milliseconds (3 seconds)
    }
}
