package com.artshell.kotlin.what_new_11

fun main(args: Array<String>) {
    val port = System.getenv("PORT")?.toIntOrNull() ?: 80
    println(port)
}