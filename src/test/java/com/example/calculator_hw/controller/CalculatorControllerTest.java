package com.example.calculator_hw.controller;

import com.example.calculator_hw.exception.DivNullException;
import com.example.calculator_hw.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    CalculatorService calculatorService = new CalculatorService();

    int a = 5;
    int b = 5;

    int c = 1;
    int d = 2;


    @Test
    void greetings() {
    }

    @Test
    void returnWhenSumFiveAndFive() {
        int expected = calculatorService.plus(a, b);
        int actual = a + b;

        assertEquals(expected, actual);

    }

    @Test
    void returnWhenSumOneAndTwo() {
        int expected = calculatorService.plus(c, d);
        int actual = c + d;

        assertEquals(expected, actual);

    }

    @Test
    void returnWhenSubtractFiveAndFive() {
        int expected = calculatorService.minus(a, b);
        int actual = a - b;

        assertEquals(expected, actual);

    }

    @Test
    void returnWhenSubtractOneAndTwo() {
        int expected = calculatorService.minus(c, d);
        int actual = c - d;

        assertEquals(expected, actual);

    }

    @Test
    void returnWhenMultiplyFiveAndFive() {
        int expected = calculatorService.multiply(a, b);
        int actual = a * b;

        assertEquals(expected, actual);

    }

    @Test
    void returnWhenMultiplyOneAndTwo() {
        int expected = calculatorService.multiply(c, d);
        int actual = c * d;

        assertEquals(expected, actual);

    }

    @Test
    void returnWhenDivideFiveAndFive() {
        int expected = calculatorService.divide(a, b);
        int actual = a / b;

        assertEquals(expected, actual);

    }

    @Test
    void returnWhenDivideOneAndTwo() {
        int expected = calculatorService.divide(c, d);
        int actual = c / d;

        assertEquals(expected, actual);

    }

    @Test
    void shouldTrowDivNullExceptionWhenDivByZero() {
        assertThrows(DivNullException.class, () -> calculatorService.divide(5, 0));
    }
}