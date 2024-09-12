package com.example.library

import javax.inject.Inject

//@ContributesBinding(Singleton::class)
class Feature2Impl @Inject constructor(private val dependency: Dependency2) : Feature2 {
    override fun run() {
        dependency.run()
    }
}
