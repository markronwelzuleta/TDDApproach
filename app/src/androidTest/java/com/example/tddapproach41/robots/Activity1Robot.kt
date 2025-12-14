package com.example.tddapproach41.robots

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.tddapproach41.R

class Activity1Robot {

    fun enterNumber(number: String): Activity1Robot {
        onView(withId(R.id.editTextNumber))
            .perform(typeText(number), closeSoftKeyboard())
        return this
    }

    fun clickNext(): Activity1Robot {
        onView(withId(R.id.buttonNext))
            .perform(click())
        return this
    }

    fun verifyScreenVisible(): Activity1Robot {
        onView(withId(R.id.editTextNumber))
            .check(matches(isDisplayed()))
        return this
    }
}
