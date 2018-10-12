package com.artshell.kotlin.what_new_11

public val <T> List<T>.lastIndex: Int inline get() = this.size - 1

private val <T> List<T>.lastElement: T get() = this[this.size - 1]

fun main(args: Array<String>) {
    val list = listOf('a', 'b')

    // the getter will be inlined
    println("Last index of $list is ${list.lastIndex}")

    println("Last element of $list is ${list.lastElement}")
}