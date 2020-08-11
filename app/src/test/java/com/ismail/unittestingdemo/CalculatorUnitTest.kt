package com.ismail.unittestingdemo

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorUnitTest {
    private val calculator = Calculator()

    @Test
    fun addition_isCorrect() {
        assertEquals(calculator.addNumbers(2, 7), 9)
    }

    @Test
    fun subtraction_isCorrect() {

        assertEquals(calculator.subtractNumbers(13, 8), 5)
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(calculator.multiplyNumbers(5, 8), 40)
    }

    //Test arithmetic Exception
    @Test(expected = ArithmeticException::class)
    fun division_exception_caught() {
        assertEquals(calculator.divideNumbers(10, 0), 2)
    }

    @Test
    fun division_isCorrect() {
        assertEquals(calculator.divideNumbers(20, 2), 10)
    }
}