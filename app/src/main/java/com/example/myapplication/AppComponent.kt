package com.example.myapplication

import com.example.library.Dependency1
import com.example.library.Dependency2
import com.example.library.Feature1
import com.example.library.Feature2
import com.squareup.anvil.annotations.MergeComponent
import javax.inject.Singleton

@MergeComponent(Singleton::class)
interface AppComponent {
    fun feature1() : Feature1
    fun dependency1() : Dependency1

    fun feature2() : Feature2
    fun dependency2() : Dependency2

    fun inject(mainActivity: MainActivity)
}
