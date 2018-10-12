package com.artshell.kotlin.what_new_11

val numberRegex = "\\d+".toRegex()
val numbers = listOf("abc", "123", "456").filter(numberRegex::matches)
val strChrs = arrayListOf("java", "12", "vert.x").filter { numberRegex.matches(it) }

fun main(args: Array<String>) {
    println("Result is $numbers")
    println("Result is $strChrs")
}