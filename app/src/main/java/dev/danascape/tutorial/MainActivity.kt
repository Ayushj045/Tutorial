package dev.danascape.tutorial

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDialog1 = findViewById<Button>(R.id.btnDialog1)
        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("Add Saalim to your contact list")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "You Added Saalim to your contact list", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(this, "You didn't add Saalim to your contact list", Toast.LENGTH_SHORT).show()
            }.create()

        btnDialog1.setOnClickListener() {
            addContactDialog.show()
        }

        val option = arrayOf("First ITem", "Second ITem", "Third Item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose an Option")
            .setSingleChoiceItems(option, 0) { dialogInterface, i ->
                Toast.makeText(this, "You clicked on ${option[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You accepted the Dialog", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "You declined the Dialog", Toast.LENGTH_SHORT).show()
            }.create()

        val btnDialog2 = findViewById<Button>(R.id.btnDialog2)
        btnDialog2.setOnClickListener() {
            singleChoiceDialog.show()
        }

        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose an Option")
            .setMultiChoiceItems(option, booleanArrayOf(false, false, false)) { dialogInterface, i, b ->
                if (b == true) {
                    Toast.makeText(this, "You clicked on ${option[i]}", Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You accepted the Dialog", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "You declined the Dialog", Toast.LENGTH_SHORT).show()
            }.create()

        val btnDialog3 = findViewById<Button>(R.id.btnDialog3)
        btnDialog3.setOnClickListener() {
            multiChoiceDialog.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.miAddContact -> Toast.makeText(this, "You clicked on Add Contact", Toast.LENGTH_SHORT).show()
            R.id.miFavorites -> Toast.makeText(this, "You clicked on Favorites", Toast.LENGTH_SHORT).show()
            R.id.miSettings -> Toast.makeText(this, "You clicked on Settings", Toast.LENGTH_SHORT).show()
            R.id.miClose -> Toast.makeText(this, "Finish", Toast.LENGTH_SHORT).show()
            R.id.miFeedback -> Toast.makeText(this, "You clicked on Feedback", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}