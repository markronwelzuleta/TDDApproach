package com.example.tddapproach41

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Timer

class Activity2 : AppCompatActivity() {

    private lateinit var itemLoader: ItemLoader

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val count = intent.getIntExtra("ITEM_COUNT", 0)

        // ✅ INITIALIZE ItemLoader (IMPORTANT)
        itemLoader = ItemLoader(
            timer = Timer()
        )

        itemLoader.loadItems(count) { items ->
            runOnUiThread {
                recyclerView.adapter = ItemAdapter(items) { clickedItem ->
                    val intent = Intent(this@Activity2, Activity3::class.java)
                    intent.putExtra("CLICKED_ITEM", clickedItem.text)
                    startActivity(intent)
                }
            }
        }
    }
}
