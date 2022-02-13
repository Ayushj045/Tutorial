package dev.danascape.tutorial

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        val btnCount = findViewById<Button>(R.id.btnCount) // IDK why
        val tvCount = findViewById<TextView>(R.id.tvCount)

        btnCount.setOnClickListener {
            count ++
            tvCount.text = "Let's Count: $count"
        }

    }
}