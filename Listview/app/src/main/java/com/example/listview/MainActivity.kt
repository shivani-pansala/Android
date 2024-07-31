package com.example.listview

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
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


        var listview : ListView = findViewById(R.id.listView)

        var city = arrayOf("Rajkot","Ahemdabad","Baroda","Amreli")
        var adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city)
        listview.adapter = adapter

        listview.setOnItemClickListener { adapterView, view, i, l ->
            var value = listview.getItemAtPosition(i).toString()

            when(value)
            {
                "Rajkot"->{
                    var i = Intent(this,Rajkot::class.java)
                    startActivity(i) }
                "Ahemdabad"->{
                    var i = Intent(this,Ahemdabad::class.java)
                    startActivity(i) }
                "Baroda"->{
                    var i = Intent(this,Baroda::class.java)
                    startActivity(i) }
                "Amreli"->{
                    var i = Intent(this,Amreli::class.java)
                    startActivity(i) }


            }
        }

    }
}