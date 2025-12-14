package com.example.tddapproach41

import java.util.Timer
import kotlin.concurrent.schedule

class ItemLoader(
    private val timer: Timer
) {

    fun loadItems(count: Int, callback: (List<ItemModel>) -> Unit) {
        IdlingCallbacks.onStart?.invoke()

        timer.schedule(1000) {
            val items = (1..count).map {
                ItemModel("Item $it")
            }

            callback(items)
            IdlingCallbacks.onFinish?.invoke()
        }
    }
}
