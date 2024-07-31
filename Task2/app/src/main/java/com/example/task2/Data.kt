package com.example.task2

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Data : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_data)

        var txtnm : TextView = findViewById(R.id.textView)
        var txtpsw : TextView = findViewById(R.id.textView2)
        var txtemail : TextView = findViewById(R.id.textView4)
        var txtdob : TextView = findViewById(R.id.textView5)
        var txtcity : TextView = findViewById(R.id.textView6)
        var txtgender : TextView = findViewById(R.id.textView7)
        var txthobby : TextView = findViewById(R.id.textView8)


        var intent:Intent=intent

        var dname=intent.getStringExtra("name")
        txtnm.setText("name : "+dname)

        var dpassword= intent.getStringExtra("password")
        txtpsw.setText("Password :"+dpassword)

        var demail = intent.getStringExtra("email")
        txtemail.setText("Email :"+demail)

        var ddob = intent.getStringExtra("dob")
        txtdob.setText("DOB :"+ddob)

        var dcity = intent.getStringExtra("city")
        txtcity.setText("City :"+dcity)

        var dgender = intent.getStringExtra("gender")
        txtgender.setText("Gender :"+dgender)

        var dhobby = intent.getStringExtra("hobby")
        txthobby.setText("Hobby :"+dhobby)



    }
}