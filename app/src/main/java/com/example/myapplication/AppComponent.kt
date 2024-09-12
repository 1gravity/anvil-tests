package com.example.myapplication

import com.example.dependencies.AppSubComponent
import com.squareup.anvil.annotations.ContributesTo
import com.squareup.anvil.annotations.MergeComponent
import dagger.Module

@ContributesTo(String::class)
@Module(subcomponents = [AppSubComponent::class])
interface AppMergeModule

@MergeComponent(String::class)
interface AppComponent {
    fun appMergeComponentFactory() : AppSubComponent.Factory

    fun inject(mainActivity: MainActivity)
}
