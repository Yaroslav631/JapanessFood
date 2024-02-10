package com.example.japanesefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun ere(view: View) {
        val intent: Intent = Intent(this@MainActivity2, infoActivity::class.java)
        startActivity(intent)
finish()
    }

    fun rrr(view: View) {
        val intent: Intent = Intent(this@MainActivity2, foodActivity1::class.java)
        startActivity(intent)

    }

    fun trtr(view: View) {
        val intent: Intent = Intent(this@MainActivity2, allActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun rtrtr(view: View) {
        val intent: Intent = Intent(this@MainActivity2, foodActivity2::class.java)
        startActivity(intent)

    }

    fun rrddrdr(view: View) {
        val intent: Intent = Intent(this@MainActivity2, foodActivity3::class.java)
        startActivity(intent)
    }


}





