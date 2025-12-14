package com.example.tddapproach41

import android.app.Application
import java.util.Timer

class MyApplication : Application() {

    lateinit var itemLoader: ItemLoader

    override fun onCreate() {
        super.onCreate()

        itemLoader = ItemLoader(timer = Timer())
    }
}
