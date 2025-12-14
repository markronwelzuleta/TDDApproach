package com.example.tddapproach41

object IdlingCallbacks {
    var onStart: (() -> Unit)? = null
    var onFinish: (() -> Unit)? = null
}
