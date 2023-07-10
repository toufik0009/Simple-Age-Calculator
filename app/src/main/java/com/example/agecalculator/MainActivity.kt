package com.example.agecalculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnGetAge(view: View) {
            val tvAge: TextView = findViewById(R.id.tvAge)
            val etBirth: EditText = findViewById(R.id.etBrith)

            val dob: String = etBirth.text.toString()//Convert to string
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)//Declared the Current Year
            val age = currentYear - dob.toInt()//current year - my birth year
            tvAge.text = "Your Age is:- $age"//then display....
    }
}