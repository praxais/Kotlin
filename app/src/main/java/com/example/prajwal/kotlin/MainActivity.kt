package com.example.prajwal.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var a: Int = 1

    val s1 = "a is $a"

    var s2 = s1.replace("is", "was", true)

    var nullableItems = listOf("Apple", "Banana", null, "Corn")
    var intItems = nullableItems.filterNotNull()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Value: $s2")

        println("NullableItems: $nullableItems")
        println("NonNullableItems: $intItems")

        for (item in intItems) {
            println("Item -> $item")
        }

        for (index in intItems.indices) {
            println("Item at $index -> ${intItems[index]}")
        }

        var index: Int = 0

        while (index < intItems.size) {
            val str = "Item at $index IS ${intItems[index]}"
            println(str.replace("is", "was", true))
            index++
        }

        val x = 10
        val y = 9

        if (x in 1..y + 1) println("Fits")

        for (value in 10 downTo 1 step 2) {
            println(value)
        }


        intItems
                .filter { it.startsWith("a", true) }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println("Sorted $it") }

//        println("stringvalue".spaceToCamelCase())

        doWhile()
    }

    fun addSum(a: Int, b: Int) = a + b

    fun printSum(a: Int, b: Int) {
        println("A+B= ${a + b}")
    }

    fun getMax(a: Int, b: Int) = if (a > b) a else b

    fun parseInt(str: String): Int? {
        return null
    }

    data class Customer(val name: String, val value: Int)

    fun String.spaceToCamelCase(){
    }

    fun doWhile(){
        val  x = 9

        when (x){
            in 1..8 -> println("x is $x")
            9 -> println("x is $x")
            else -> println("X is nothing")
        }
    }

}
