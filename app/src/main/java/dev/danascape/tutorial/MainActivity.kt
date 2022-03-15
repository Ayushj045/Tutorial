package dev.danascape.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToast = findViewById<Button>(R.id.btnToast)

        btnToast.setOnClickListener {
            Toast.makeText(applicationContext, "Hi I am a toast", Toast.LENGTH_SHORT  ).show()
        }

    }
}