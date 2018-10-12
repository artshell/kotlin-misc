package com.artshell.kotlin.what_new_11

import java.util.*

fun needAnswer() = Random().nextBoolean()

fun main(args: Array<String>) {
    val answer by lazy {
        println("Calculating the answer...")
        42
    }

    if (needAnswer()) { // returns the random value
        println("The answer is $answer") // answer is calculated at this point
    } else {
        println("Sometimes no answer is the answer...")
    }
}

