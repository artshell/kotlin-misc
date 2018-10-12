package com.artshell.kotlin.what_new_11

fun main(args: Array<String>) {
    val map = mapOf(1 to "one", 2 to "two")
    println(map.mapValues { entry ->
        val (key, value) = entry
        "$key -> $value!"
    })

    println(map.mapValues { (key, value) -> "$key -> $value!" })
}