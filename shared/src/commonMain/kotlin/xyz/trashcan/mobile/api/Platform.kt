package xyz.trashcan.mobile.api

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform