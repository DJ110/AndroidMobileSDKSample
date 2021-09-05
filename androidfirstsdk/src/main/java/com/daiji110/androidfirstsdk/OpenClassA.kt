package com.daiji110.androidfirstsdk

open class OpenClassA(val name: String) {

    open fun message() : String {
        return "Hello $name"
    }
}