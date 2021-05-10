package demo

import koma.*

fun getGreeting(): String {
    val words = mutableListOf<String>()
    words.add("Hello,")
    words.add("koma world!")

    return words.joinToString(separator = " ")
}

fun main(args: Array<String>) {
    println(getGreeting())
    println(koma.randn(5,5))
}
