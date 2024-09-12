package com.example.library

import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Singleton

//@ContributesBinding(Singleton::class)
class FeatureImpl @Inject constructor(private val dependency: Dependency) : Feature {
    override fun run() {
        dependency.run()
    }
}
