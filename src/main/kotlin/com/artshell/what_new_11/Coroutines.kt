package com.artshell.kotlin.what_new_11

import kotlin.coroutines.experimental.buildSequence

fun main(args: Array<String>) {
    val seq = buildSequence {
        println("buildSequence")
        for (i in 1..5) {
            println(i)
            // yield a square of i
            yield(i * i)
        }
        // yield a range
        yieldAll(26..28)
    }

    // print the sequence
    println("print the sequence")
    println(seq.toList())
}