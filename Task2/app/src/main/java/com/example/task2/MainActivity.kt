package com.example.task2

import android.content.Intent
import android.os.Bundle
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var pb : ProgressBar = findViewById(R.id.progressBar2)

        Thread(Runnable {
            var count = 0
            while (count <= 100)
            {
                Thread.sleep(50)
                count ++
                pb.setProgress(count)
                pb.secondaryProgress = count+10
            }
            if(count >= 100)
            {
                var i = Intent(this,Registration::class.java)
                startActivity(i)
            }
        }).start()

    }
}