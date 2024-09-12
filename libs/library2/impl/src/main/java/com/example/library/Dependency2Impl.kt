package com.example.library

import javax.inject.Inject

//@ContributesBinding(Singleton::class)
class Dependency2Impl @Inject constructor() : Dependency2 {
    override fun run() {
        println("DependencyImpl.run")
    }

    fun test() {
        println("DependencyImpl.test")
    }
}
