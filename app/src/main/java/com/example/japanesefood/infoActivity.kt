package com.example.japanesefood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class infoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
    }

    fun ert(view: View) {
        val intent: Intent = Intent(this@infoActivity, MainActivity2::class.java)
        startActivity(intent)
        finish()
    }

    fun jhgf(view: View) {
        val intent: Intent = Intent(this@infoActivity, allActivity::class.java)
        startActivity(intent)
        finish()
    }
}