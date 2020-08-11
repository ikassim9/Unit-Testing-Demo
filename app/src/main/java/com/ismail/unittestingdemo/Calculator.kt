package com.ismail.unittestingdemo

import java.lang.IndexOutOfBoundsException

/*
Model class for unit testing
 */
class Calculator {

    fun addNumbers(a: Int, b: Int): Int {
        return a + b
    }

    fun subtractNumbers(a: Int, b: Int): Int {
        return a - b
    }

    fun multiplyNumbers(a: Int, b: Int): Int {
        return a * b
    }

    fun divideNumbers(a: Int, b: Int): Int {
        if(b == 0) {
            throw ArithmeticException("Can't divide by zero")

        }
        return a / b

    }
}