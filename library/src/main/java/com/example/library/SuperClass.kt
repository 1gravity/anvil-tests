package com.example.library

import javax.inject.Inject

class SuperClass @Inject constructor(): BaseClass<Feature>() {
    @Inject
    lateinit var feature: Feature
}
