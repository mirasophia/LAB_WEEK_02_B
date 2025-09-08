package com.example.lab_week_02_b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputColor = findViewById<EditText>(R.id.inputColor)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val colorCode = inputColor.text.toString()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("COLOR_CODE", colorCode)
            startActivity(intent)
        }
    }
}
