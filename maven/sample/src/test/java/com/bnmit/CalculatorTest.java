package com.bnmit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Addition should work correctly")
    void testAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    @DisplayName("Multiplication should work correctly")
    void testMultiplication() {
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    @DisplayName("Division by zero should throw Exception")
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}