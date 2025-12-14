package com.example.tddapproach41

import android.app.Application
import java.util.Timer

class UiTestApplication : Application() {

    lateinit var itemLoader: ItemLoader

    override fun onCreate() {
        super.onCreate()

        itemLoader = ItemLoader(
            timer = Timer(),
            onStart = { EspressoIdlingResource.countingIdlingResource.increment() },
            onFinish = { EspressoIdlingResource.countingIdlingResource.decrement() }
        )
    }
}
