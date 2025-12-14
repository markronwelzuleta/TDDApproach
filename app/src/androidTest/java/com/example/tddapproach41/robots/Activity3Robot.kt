package com.example.tddapproach41.robots

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.tddapproach41.R

class Activity3Robot {

    fun verifyItemTextDisplayed(text: String): Activity3Robot {
        onView(withId(R.id.textViewResult))
            .check(matches(withText("You clicked $text")))
        return this
    }
}

