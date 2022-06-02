package dev.danascape.tutorial

import android.os.Bundle
import android.text.Layout
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShowToast = findViewById<Button>(R.id.btnShowToast)

        btnShowToast.setOnLongClickListener {
//            Toast(this).apply {
//                duration = Toast.LENGTH_LONG
//                val clToast = findViewById<Layout>(R.id.clToast)
//                view = layoutInflater.inflate(R.layout.custom_toast, clToast)
//            }
            Toast.makeText(applicationContext, "This is a toast", Toast.LENGTH_SHORT).show()
            true
        }
    }
}