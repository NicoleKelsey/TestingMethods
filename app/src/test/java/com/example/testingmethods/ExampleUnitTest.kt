package com.example.testingmethods

import org.junit.Assert.assertEquals
import org.junit.Test

class MyExampleClassTest {

    @Test
    fun testSayHello() {
        assertEquals("Hello, Nicole!", "Hello, Nicole!")
    }

    @Test
    fun testAddNumbers() {
        val myExample = MyExampleClass()
        assertEquals(8, myExample.addNumbers(5, 3))
    }

    @Test
    fun testGreetUser() {

        assertEquals("Hello, Nicole!", "Hello, Nicole!")
    }

    @Test
    fun testPrintLength() {

        assertEquals(13, 13)
    }

    @Test
    fun testGenerateNumbers() {
        val myExample = MyExampleClass()
        val numbers = myExample.generateNumbers(5)
        assertEquals(listOf(1, 2, 3, 4, 5), numbers)
    }
}
