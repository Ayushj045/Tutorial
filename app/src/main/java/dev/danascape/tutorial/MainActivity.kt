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
        val etAge = findViewById<EditText>(R.id.etAge)
        val etCountry = findViewById<EditText>(R.id.etCountry)
        val etName = findViewById<EditText>(R.id.etName)

        btnApply.setOnLongClickListener { it ->
            val age = etAge.text.toString().toInt()
            val country = etCountry.text.toString()
            val name = etName.text.toString()
            val person =  Person(name, age, country)
            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_PERSON", person)
                startActivity(it)
            }
            true
        }
    }
}