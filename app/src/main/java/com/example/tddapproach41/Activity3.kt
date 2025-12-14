package com.example.tddapproach41

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val textView = findViewById<TextView>(R.id.textViewResult)

        val clickedItem = intent.getStringExtra("CLICKED_ITEM") ?: ""

        textView.text = "You clicked $clickedItem"

    }
}
