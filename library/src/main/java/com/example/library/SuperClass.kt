package com.example.library

import javax.inject.Inject
import javax.inject.Provider

class SuperClass @Inject constructor(): BaseClass<Feature>() {
    @Inject
    lateinit var featureProvider: Provider<Feature>
    @Inject
    lateinit var feature: Feature
}
