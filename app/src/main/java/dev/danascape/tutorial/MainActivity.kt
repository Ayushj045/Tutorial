package dev.danascape.tutorial

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("InflateParams")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApply = findViewById<Button>(R.id.btnApply)
        val etName = findViewById<EditText>(R.id.etName)

        btnApply.setOnLongClickListener { it ->
            val name = etName.text.toString()
            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_NAME", name)
                startActivity(it)
            }
            true
        }
    }
}