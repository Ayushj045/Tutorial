package dev.danascape.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToast = findViewById<Button>(R.id.btnToast)

        // apply an onClickListener() method
        btnToast.setOnClickListener{
            Toast(this).showCustomToast ("Hello! This is a custom Toast!", this)
        }
    }
}
