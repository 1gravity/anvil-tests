package com.example.library

import javax.inject.Inject

open class BaseClass<T : Any> {
    @Inject
    lateinit var value: T

    fun foo(): T {
        return value
    }
}

class Class : BaseClass<Feature>() {
    @Inject
    lateinit var feature: Feature

    fun bar(): Feature {
        return value
    }
}
