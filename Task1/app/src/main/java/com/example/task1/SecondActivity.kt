package com.example.task1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        var android : Button = findViewById(R.id.button)

        android.setOnClickListener {
                  var i = Intent(this,Android::class.java)
                  startActivity(i)
        }

        var url : Button = findViewById(R.id.button2)

        url.setOnClickListener {
            var i = Intent(this,Rating::class.java)
            startActivity(i)
        }

        var from : Button = findViewById(R.id.button3)

        from.setOnClickListener {
            var i = Intent(this,From::class.java)
            startActivity(i)
        }

        var rel : Button = findViewById(R.id.button4)

        rel.setOnClickListener {
            var i = Intent(this,RelativeLyout::class.java)
            startActivity(i)
        }
    }
}