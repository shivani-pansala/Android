package com.example.task2

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.MultiAutoCompleteTextView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Registration : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)

        var name : EditText = findViewById(R.id.editTextText2)
        var password : EditText = findViewById(R.id.editTextTextPassword)
        var email : EditText = findViewById(R.id.editTextTextEmailAddress)
        var date : EditText = findViewById(R.id.editTextDate)
        var city : AutoCompleteTextView = findViewById(R.id.autoCompleteTextView)
        var gender : RadioGroup = findViewById(R.id.radiogroup)
        var hobby : MultiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView)
        var btn : Button = findViewById(R.id.button)


        var str : String = ""

        gender.setOnCheckedChangeListener { radioGroup, i ->
            var rbtn = findViewById<RadioButton>(i)
            str=rbtn.text.toString()
        }

        email.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(!android.util.Patterns.EMAIL_ADDRESS.matcher(p0).matches())
                {
                    email.setError("Invalid Input")
                }

            }
            override fun afterTextChanged(p0: Editable?) {
            }
        })

        var c = Calendar.getInstance()

        date.setOnClickListener {
            DatePickerDialog(this,DatePickerDialog.OnDateSetListener { datePicker, year, month, day ->
                date.setText("$day/${month}/$year")
            },c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show()
                
        }


        btn.setOnClickListener {
             var i = Intent(this,Data::class.java)
            i.putExtra("name",name.text.toString())
            i.putExtra("password",password.text.toString())
            i.putExtra("email",email.text.toString())
            i.putExtra("dob",date.text.toString())
            i.putExtra("city",city.text.toString())
            i.putExtra("gender",str)
            i.putExtra("hobby",hobby.text.toString())

            startActivity(i)
        }


    }
}