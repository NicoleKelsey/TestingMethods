package com.example.testingmethods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myExample = MyExampleClass()

        // Call the methods from MyExampleClass
        myExample.sayHello()

        val sum = myExample.addNumbers(5, 3)
        println("Sum: $sum")

        myExample.greetUser("Alice")

        myExample.printLength("Hello, Nicole!")

        val numbers = myExample.generateNumbers(5)
        println("Generated Numbers: $numbers")
    }
}







