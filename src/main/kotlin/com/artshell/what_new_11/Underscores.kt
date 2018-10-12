package com.artshell.kotlin.what_new_11

fun main(args: Array<String>) {
    var map = mapOf(1 to "java", 2 to "vert.x")
    map.forEach { _, value -> println("$value!") }
}