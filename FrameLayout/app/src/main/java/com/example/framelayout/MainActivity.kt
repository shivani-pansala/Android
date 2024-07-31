package com.example.framelayout

import android.content.Intent
import android.os.Bundle
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var pg : ProgressBar = findViewById(R.id.progressBar)

        Thread(Runnable
        {
            var count = 0
            while (count <= 100)
            {
                Thread.sleep(100)
                count++
                pg.setProgress(count)
                pg.secondaryProgress = count + 10
            }
            if(count >= 100)
            {
                var i = Intent(this,SecondActivity::class.java)
                startActivity(i)
            }
        }).start()

    }
}