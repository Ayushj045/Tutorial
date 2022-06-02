package dev.danascape.tutorial

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPhoto = findViewById<Button>(R.id.btnPhoto)
        val ivPhoto = findViewById<ImageView>(R.id.ivPhoto)
        btnPhoto.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "image/*"
                startActivityForResult(it, 0)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val ivPhoto = findViewById<ImageView>(R.id.ivPhoto)
        if (resultCode == RESULT_OK && requestCode == 0) {
            val uri = data?.data
            ivPhoto.setImageURI(uri)
        }
    }
}