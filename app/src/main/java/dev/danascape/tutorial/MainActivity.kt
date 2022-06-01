package dev.danascape.tutorial

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowToast = findViewById<Button>(R.id.btnShowToast)

        btnShowToast.setOnLongClickListener {
            toast {
                "hello"
            }
            true
        }
    }
}