package com.shivangi.musicApp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform