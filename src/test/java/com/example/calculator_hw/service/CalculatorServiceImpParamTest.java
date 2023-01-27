package com.example.calculator_hw.service;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorServiceImpParamTest {
    CalculatorService calculatorService = new CalculatorService();


    @ParameterizedTest
    @MethodSource("provideCalculatorParam")
    public void showSumCorrect(int a, int b) {
        int result = calculatorService.plus(a, b);
        assertEquals(a + b, result);
    }
    @ParameterizedTest
    @MethodSource("provideCalculatorParam")
    public void showSubtractCorrect(int a, int b) {
        int result = calculatorService.minus(a, b);
        assertEquals(a - b, result);
    }
    @ParameterizedTest
    @MethodSource("provideCalculatorParam")
    public void showMultiplyCorrect(int a, int b) {
        int result = calculatorService.multiply(a, b);
        assertEquals(a * b, result);
    }
    @ParameterizedTest
    @MethodSource("provideCalculatorParam")
    public void showDivCorrect(int a, int b) {
        int result = calculatorService.divide(a, b);
        assertEquals(a / b, result);
    }


    private static Stream<Arguments> provideCalculatorParam() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(3, 4),
                Arguments.of(2, 3),
                Arguments.of(0, 2)
        );
    }
}
