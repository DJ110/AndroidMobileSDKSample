package com.daiji110.androidfirstsdk

import org.junit.Assert
import org.junit.Test

class OpenClassATest {

    class SubClassA(name: String) : OpenClassA(name) {

        private var age: Int = 0

        constructor(name: String, age: Int) : this(name) {
            this.age = age
        }

        override fun message() : String {
            return "Hello $name, Age $age"
        }
    }

    @Test
    fun testOpenClassA() {
        var sub = SubClassA("Jiro", 10)
        Assert.assertEquals("Hello Jiro, Age 10", sub.message())
    }
}