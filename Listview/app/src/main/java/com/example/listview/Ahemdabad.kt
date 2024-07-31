package com.example.listview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ahemdabad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ahemdabad)

        var back : Button = findViewById(R.id.button2)

        back.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }

    }
}