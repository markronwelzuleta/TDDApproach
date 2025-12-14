package com.example.tddapproach41

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import java.util.Timer
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

class ItemLoaderTest {

    private lateinit var loader: ItemLoader
    private lateinit var timer: Timer

    @Before
    fun setUp() {
        timer = Timer()
        loader = ItemLoader(timer)
    }

    @Test
    fun loadItems_returnsCorrectNumberOfItems() {
        val latch = CountDownLatch(1)
        var result: List<ItemModel> = emptyList()

        loader.loadItems(3) {
            result = it
            latch.countDown()
        }

        latch.await(2, TimeUnit.SECONDS)

        assertEquals(3, result.size)
    }
}
