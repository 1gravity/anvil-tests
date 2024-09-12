package com.example.library

import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Singleton

@ContributesBinding(Singleton::class)
class FeatureImpl1Binding @Inject constructor(private val dependency: Dependency1) : Feature1 by Feature1Impl(dependency)
