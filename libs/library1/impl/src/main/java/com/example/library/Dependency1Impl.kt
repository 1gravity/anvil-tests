package com.example.library

import javax.inject.Inject

//@ContributesBinding(Singleton::class)
class Dependency1Impl @Inject constructor() : Dependency1 {
    override fun run() {
        println("DependencyImpl.run")
    }

    fun test() {
        println("DependencyImpl.test")
    }
}
