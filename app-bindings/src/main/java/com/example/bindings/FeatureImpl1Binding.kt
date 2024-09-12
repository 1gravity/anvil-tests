package com.example.bindings

import com.example.library.Dependency1
import com.example.library.Feature1
import com.example.library.Feature1Impl
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Singleton

@ContributesBinding(Singleton::class)
class FeatureImpl1Binding @Inject constructor(private val dependency: Dependency1) : Feature1 by Feature1Impl(dependency)
