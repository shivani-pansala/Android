package com.example.relativelyout

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Checkable
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btn :Button = findViewById(R.id.button)
        var tglbtn : ToggleButton = findViewById(R.id.toggleButton2)
        var imgview : ImageView = findViewById(R.id.imageView)
        var imgbtn : ImageButton = findViewById(R.id.imageButton)
        var fab : FloatingActionButton = findViewById(R.id.floatingActionButton)

        var str : String
        var ch1 : CheckBox = findViewById(R.id.checkBox)
        var ch2 : CheckBox = findViewById(R.id.checkBox2)
        var ch3 : CheckBox = findViewById(R.id.checkBox3)
        var textView : TextView = findViewById(R.id.textView)

        btn.setOnClickListener {
            Toast.makeText(applicationContext,"Simple Button Click",Toast.LENGTH_LONG).show()
        }

        tglbtn.setOnClickListener {
            if(tglbtn.text.equals("OFF"))
            {
                imgview.setImageResource(R.drawable.off)
            }
            else
            {
                imgview.setImageResource(R.drawable.on)
            }
        }

        imgbtn.setOnClickListener{
            Toast.makeText(applicationContext,"Image button click",Toast.LENGTH_LONG).show()
        }

        fab.setOnClickListener {
            Toast.makeText(applicationContext,"FloatingActionButton",Toast.LENGTH_LONG).show()
        }

        ch1.setOnClickListener {
            str = "JAVA ${ch1.isChecked}\n KOTLIN  ${ch2.isChecked} \n ANDROID ${ch3.isChecked}"
            textView.setText(str)
        }

        ch2.setOnClickListener {
            str = "JAVA ${ch1.isChecked}\n KOTLIN  ${ch2.isChecked} \n ANDROID ${ch3.isChecked}"
            textView.setText(str)
        }

        ch3.setOnClickListener {
            str = "JAVA ${ch1.isChecked}\n KOTLIN  ${ch2.isChecked} \n ANDROID ${ch3.isChecked}"
            textView.setText(str)
        }

       var rg : RadioGroup = findViewById(R.id.radiogroup)
        var tv : TextView = findViewById(R.id.textView2)
        var reset : Button = findViewById(R.id.button2)

        rg.setOnCheckedChangeListener { radioGroup, i ->
            var rbtn = findViewById<RadioButton>(i)
            if(rbtn!=null)
            {
                tv.setText(rbtn.text)
            }
        }
        reset.setOnClickListener {
            rg.clearCheck()
            tv.setText("Select Option")
        }
    }


}