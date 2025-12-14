package com.example.tddapproach41

import android.app.Application
import java.util.Timer

class IntegrationTestApplication : Application() {

    lateinit var itemLoader: ItemLoader

    override fun onCreate() {
        super.onCreate()

        // FAST loader for tests (no delay, no Espresso dependency)
        itemLoader = ItemLoader(
            timer = Timer()

        )
    }
}
