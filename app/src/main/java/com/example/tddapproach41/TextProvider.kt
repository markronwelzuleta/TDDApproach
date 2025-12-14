package com.example.tddapproach41

import android.content.Context

class TextProvider(private val context: Context) {

    fun activity3Text(item: String): String {
        return "You clicked $item"
    }

    fun emptyText(): String {
        return ""
    }
}
