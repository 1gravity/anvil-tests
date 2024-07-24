package com.example.myapplication

import com.example.library.Feature
import com.squareup.anvil.annotations.MergeComponent
import javax.inject.Singleton

@MergeComponent(Singleton::class)
interface AppComponent {
    fun feature() : Feature
}
