package dev.danascape.tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnApply = findViewById<Button>(R.id.btnApply) // IDK why
        val etFirstName = findViewById<EditText>(R.id.etFIrstName)
        val etLastName = findViewById<EditText>(R.id.etLastName)
        val etBirthDate = findViewById<EditText>(R.id.etBirthDate)
        val etCountry = findViewById<EditText>(R.id.etCountry)


        btnApply.setOnClickListener {
            val firstName = etFirstName.text.toString()
            val lastName = etLastName.text.toString()
            val birthDate = etBirthDate.text.toString()
            val country = etCountry.text.toString()
            Log.d("MainActivity", "$firstName $lastName, born on $birthDate from $country")

        }

    }
}