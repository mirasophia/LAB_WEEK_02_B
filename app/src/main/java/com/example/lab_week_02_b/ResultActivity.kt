package com.example.lab_week_02_b

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val layout = findViewById<ConstraintLayout>(R.id.resultLayout)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        val colorCode = intent.getStringExtra("COLOR_CODE")

        if (colorCode != null) {
            try {
                layout.setBackgroundColor(Color.parseColor(colorCode))
                txtResult.text = "Background changed to $colorCode"
            } catch (e: IllegalArgumentException) {
                Toast.makeText(this, "Invalid color code: $colorCode", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
