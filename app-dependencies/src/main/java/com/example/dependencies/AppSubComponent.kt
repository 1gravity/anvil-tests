package com.example.dependencies

import com.example.library.Dependency1
import com.example.library.Dependency2
import com.example.library.Feature1
import com.example.library.Feature2
import com.squareup.anvil.annotations.MergeSubcomponent
import dagger.Subcomponent
import javax.inject.Singleton

@MergeSubcomponent(Singleton::class)
interface AppSubComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): AppSubComponent
    }
    fun feature1() : Feature1
    fun dependency1() : Dependency1

    fun feature2() : Feature2
    fun dependency2() : Dependency2
}
