package com.example.tddapproach41

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val editText = findViewById<EditText>(R.id.editTextNumber)
        val button = findViewById<Button>(R.id.buttonNext)

        button.setOnClickListener {
            val number = editText.text.toString().toIntOrNull() ?: 0
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("ITEM_COUNT", number)
            startActivity(intent)
        }
    }
}
