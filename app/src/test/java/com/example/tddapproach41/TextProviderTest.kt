package com.example.tddapproach41

import android.content.Context
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class TextProviderTest {

    @Mock
    lateinit var context: Context

    private lateinit var textProvider: TextProvider

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        textProvider = TextProvider(context)
    }

    @Test
    fun activity3Text_returnsCorrectMessage() {
        val result = textProvider.activity3Text("Item 1")
        assertEquals("You clicked Item 1", result)
    }

    @Test
    fun emptyText_returnsEmptyString() {
        val result = textProvider.emptyText()
        assertEquals("", result)
    }
}
