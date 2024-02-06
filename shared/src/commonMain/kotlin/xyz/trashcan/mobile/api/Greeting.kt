package xyz.trashcan.mobile.api

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    fun call(): String {
        return "CALL"
    }
}