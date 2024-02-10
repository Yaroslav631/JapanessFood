package com.example.japanesefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View

class MainActivity : AppCompatActivity() {

            override fun onCreate(savedInstanceState: Bundle?) {
                setTheme(R.style.Theme_JapaneseFood)

                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
            }

    fun btn(view: View) {
        val intent: Intent = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(intent)
        this.overridePendingTransition(0, 0)
    }


    }



