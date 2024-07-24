package com.example.library

import javax.inject.Inject

open class BaseClass<T : Any> {
    @Inject
    lateinit var value: T
}
