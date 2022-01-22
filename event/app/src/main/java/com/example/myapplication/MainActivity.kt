package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.stor.SharedPreference

class MainActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var age: EditText
    lateinit var button: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPreference = SharedPreference(this)
        name = findViewById(R.id.NameEditText)
        age = findViewById(R.id.AgeEditText)
        button = findViewById(R.id.Btn_Save)

        name.setText(sharedPreference.name)
        age.setText(sharedPreference.age.toString())

        button.setOnClickListener {
            val nameValue = name.text.toString()
            val age = age.text.toString().toInt()

            sharedPreference.name = nameValue
            sharedPreference.age = age

        }
    }
}