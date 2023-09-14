package com.example.testingmethods

class MyExampleClass {

    fun sayHello() {
        println("Hello, World!")
    }

    fun addNumbers(a: Int, b: Int): Int {
        return a + b
    }

    fun greetUser(name: String = "User") {
        println("Hello, $name!")
    }

    fun printLength(text: String?) {
        if (text != null) {
            println("Length of text: ${text.length}")
        } else {
            println("Text is null.")
        }
    }

    fun generateNumbers(count: Int): List<Int> {
        val numbers = mutableListOf<Int>()
        for (i in 1..count) {
            numbers.add(i)
        }
        return numbers
    }
}

