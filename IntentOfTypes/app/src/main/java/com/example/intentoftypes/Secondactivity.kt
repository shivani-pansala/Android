package com.example.intentoftypes

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_secondactivity)

        var txtfname : TextView = findViewById(R.id.textView2)
        var txtsname : TextView = findViewById(R.id.textView3)

        var intent : Intent =intent
        var sname = intent.getStringExtra("surname")
        var name = intent.getStringExtra("name")


        txtfname.setText("Surname : "+sname)
        txtsname.setText("Name : "+name)

    }
}