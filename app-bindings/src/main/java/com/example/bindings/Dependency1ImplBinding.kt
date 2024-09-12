package com.example.bindings

import com.example.library.Dependency1
import com.example.library.Dependency1Impl
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Singleton

@ContributesBinding(Singleton::class)
class Dependency1ImplBinding @Inject constructor() : Dependency1 by Dependency1Impl()
