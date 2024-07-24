package com.example.library

import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Singleton

@ContributesBinding(Singleton::class)
class DependencyImpl @Inject constructor() : Dependency {
    override fun run() {
        println("DependencyImpl.run")
    }
}
