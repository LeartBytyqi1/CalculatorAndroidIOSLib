package com.example.calculatorandroidioslib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform