package com.example.bindings

import com.example.library.Dependency2
import com.example.library.Dependency2Impl
import com.squareup.anvil.annotations.ContributesBinding
import javax.inject.Inject
import javax.inject.Singleton

@ContributesBinding(Singleton::class)
class Dependency2ImplBinding @Inject constructor() : Dependency2 by Dependency2Impl()
