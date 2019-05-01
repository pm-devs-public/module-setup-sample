package com.parkmobile.sample.module.foo

object FooService {

    fun getBuildType(): String = "ModuleFoo: ${BuildConfig.BUILD_TYPE}"

    fun getMessage(): String = if (BuildConfig.DEBUG) "Hello World" else "Good Bye World"

}