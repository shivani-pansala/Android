package com.example.datepicker_timepicker

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.os.Build
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.DatePicker
import android.widget.EditText
import android.widget.MultiAutoCompleteTextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

           var actcity  : AutoCompleteTextView = findViewById(R.id.autoCompleteTextView)
           var city = arrayOf("Rajkot","Ahemdabad","Vadodara","Surat","Amreli")
           var adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,city)
           actcity.setAdapter(adapter)

           var mulskill : MultiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView)
           var Skill = arrayOf("Web Design","Web Development","Android App Development" , "Flutter","Dev ops")
           var skillAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,Skill)
           mulskill.setAdapter(skillAdapter)
           mulskill.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())


             var eDate : EditText = findViewById(R.id.editTextDate)
             var c = Calendar.getInstance()

                 eDate.setOnClickListener {
                 DatePickerDialog(this,DatePickerDialog.OnDateSetListener { datePicker, year, month, date ->
                     eDate.setText("$date/${month}/$year")
                 }, c.get(Calendar.YEAR),c.get(Calendar.MONTH),c.get(Calendar.DAY_OF_MONTH)).show()
            }

            var eTime:EditText=findViewById(R.id.editTextTime)
            TimePickerDialog(this,TimePickerDialog.OnTimeSetListener { timePicker, hours, minutes ->
                eTime.setText("$hours :  $minutes")
            },c.get(Calendar.HOUR),c.get(Calendar.MINUTE),true).show()

            var email : EditText = findViewById(R.id.editTextTextEmailAddress)

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
    }
}