package com.artshell.kotlin.what_new_11

enum class RGB {
    RED,
    GREEN,
    BLUE
}

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}

fun main(args: Array<String>) {
    printAllValues<RGB>()
}