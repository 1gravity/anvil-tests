package com.example.dependencies

import com.example.library.Dependency
import com.example.library.Feature
import com.squareup.anvil.annotations.MergeComponent
import javax.inject.Singleton

@MergeComponent(Singleton::class)
interface AppComponent {
    fun feature() : Feature
    fun dependency() : Dependency
}
