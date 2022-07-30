package dev.danascape.tutorial

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.media.Image
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvFirstFragment =findViewById<TextView>(R.id.FirstFragment)
        val tvSecondFragment =findViewById<TextView>(R.id.SecondFragment)
        val tvThirdFragment =findViewById<TextView>(R.id.ThirdFragment)
        val bottomNavigationView =findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        

        val firstFragment = FirstFragment()
        val SecondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()

         setCurrentFragment(firstFragment)

        BottomNavigationView .setOnNavigationItemSelectedListener{
            when(it.itemId)
    }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }



}


