package com.example.library

import javax.inject.Inject

class Class : BaseClass<Feature>() {
    // doesn't compile -> Unresolved reference: T
//    @Inject
//    lateinit var feature: Feature
}
