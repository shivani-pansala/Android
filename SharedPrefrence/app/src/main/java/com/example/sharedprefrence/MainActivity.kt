package com.example.sharedprefrence

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var edunm : EditText = findViewById(R.id.editTextText)
        var edpsw : EditText = findViewById(R.id.editTextTextPassword)
        var btn : Button = findViewById(R.id.button)
        var dis : Button = findViewById(R.id.button2)

        var sp = application.getSharedPreferences("logindata",Context.MODE_PRIVATE)
        var editor = sp.edit()

        btn.setOnClickListener {
            editor.putString("unm",edunm.text.toString())
            editor.putString("psw",edpsw.text.toString())
            editor.commit()
            Toast.makeText(applicationContext,"Data Saved!!!",Toast.LENGTH_LONG).show()
            edunm.setText("")
            edpsw.setText("")

        }

        dis.setOnClickListener {
            edunm.setText(sp.getString("unm",""))
            edpsw.setText(sp.getString("psw",""))
        }

    }
}