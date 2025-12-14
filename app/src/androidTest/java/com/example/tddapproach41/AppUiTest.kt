package com.example.tddapproach41

import androidx.test.espresso.IdlingRegistry
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.tddapproach41.robots.Activity1Robot
import com.example.tddapproach41.robots.Activity2Robot
import com.example.tddapproach41.robots.Activity3Robot
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AppUiTest {

    @Before
    fun registerIdlingResource() {
        IdlingCallbacks.onStart = {
            EspressoIdlingResource.increment()
        }
        IdlingCallbacks.onFinish = {
            EspressoIdlingResource.decrement()
        }

        IdlingRegistry.getInstance()
            .register(EspressoIdlingResource.countingIdlingResource)
    }


    @After
    fun unregisterIdlingResource() {
        IdlingRegistry.getInstance()
            .unregister(EspressoIdlingResource.countingIdlingResource)
    }

}
