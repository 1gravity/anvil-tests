package com.example.library

import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Singleton

@ContributesBinding(Singleton::class)
class DependencyImplBinding @Inject constructor() : Dependency by DependencyImpl()
