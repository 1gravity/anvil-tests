package com.example.library

import javax.inject.Inject
import javax.inject.Provider

open class BaseClass<T : Any> {
    // this doesn't compile
    @Inject
    lateinit var provider: Provider<T>

    // this compiles
    @Inject
    lateinit var value: T
}
