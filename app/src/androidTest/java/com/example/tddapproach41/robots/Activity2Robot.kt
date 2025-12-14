package com.example.tddapproach41.robots

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.tddapproach41.R
import androidx.test.espresso.matcher.ViewMatchers.hasChildCount


class Activity2Robot {

    fun verifyItemCount(expectedCount: Int): Activity2Robot {
        onView(withId(R.id.recyclerView))
            .check(matches(hasChildCount(expectedCount)))
        return this
    }

    fun clickItemAt(position: Int): Activity2Robot {
        onView(withId(R.id.recyclerView))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                    position,
                    click()
                )
            )
        return this
    }
}
