package dev.danascape.tutorial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btClose = findViewById<Button>(R.id.btClose)

        btClose.setOnLongClickListener { it ->
                finish()
            true
        }
    }
}