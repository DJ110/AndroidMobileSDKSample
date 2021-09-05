package com.daiji110.androidfirstsdk

import org.junit.Assert
import org.junit.Test

class FirstObjectTest {

    @Test
    fun testFirstObjectSimple() {
        val message= FirstObject.getGreeting("Taro")
        Assert.assertEquals("Hello, Taro", message)
    }
}