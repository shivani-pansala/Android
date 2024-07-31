package com.example.intentoftypes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        var fname : EditText = findViewById(R.id.editTextText3)
        var sname :  EditText = findViewById(R.id.editTextText4)
        var btn : Button = findViewById(R.id.button)

        btn.setOnClickListener {
            var i = Intent(this,Secondactivity::class.java)
            i.putExtra("surname",fname.text.toString())
            i.putExtra("name",sname.text.toString())
            startActivity(i)
        }

    }
}