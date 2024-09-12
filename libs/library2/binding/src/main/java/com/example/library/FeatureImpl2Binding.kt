package com.example.library

import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Singleton

@ContributesBinding(Singleton::class)
class FeatureImpl2Binding @Inject constructor(private val dependency: Dependency2) : Feature2 by Feature2Impl(dependency)
