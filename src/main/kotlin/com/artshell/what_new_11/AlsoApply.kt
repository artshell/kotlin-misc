package com.artshell.kotlin.what_new_11

class Block {
    lateinit var content: String
}

fun Block.copy() = Block().also {
    it.content = this.content
}

// using 'apply' instead
fun Block.copy1() = Block().apply {
    this.content = this@copy1.content
}

fun main(args: Array<String>) {
    val block = Block().apply { content = "Content" }
    val copy = block.copy()
    println("Testing the content was copied:")
    println(block.content == copy.content)
}