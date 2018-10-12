package com.artshell.kotlin.what_new_11

fun main(args: Array<String>) {
    val input = "Kotlin"
    val keyword = "in"

    val index = input.indexOf(keyword).takeIf { it >= 0 } ?: error("Keyword not found")
    // is the same as takeIf
    val index2 = input.indexOf(keyword).takeUnless { it < 0 } ?: error("Keyword not found")
    // do something with index of keyword in input string, given that it's found

    println("'$keyword' was found in '$input'")
    println(input)
    println(" ".repeat(index) + "^")
}