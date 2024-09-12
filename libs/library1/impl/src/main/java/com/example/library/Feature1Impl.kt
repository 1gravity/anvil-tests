package com.example.library

import javax.inject.Inject

//@ContributesBinding(Singleton::class)
class Feature1Impl @Inject constructor(private val dependency: Dependency1) : Feature1 {
    override fun run() {
        dependency.run()
    }
}
