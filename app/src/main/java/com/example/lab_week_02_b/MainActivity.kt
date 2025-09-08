package com.example.lab_week_02_b

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputColor = findViewById<EditText>(R.id.inputColor)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val colorCode = inputColor.text.toString()
            try {
                Color.parseColor(colorCode)

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("COLOR_CODE", colorCode)
                startActivity(intent)

            } catch (e: IllegalArgumentException) {
                Toast.makeText(this, "Invalid color code: $colorCode", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
