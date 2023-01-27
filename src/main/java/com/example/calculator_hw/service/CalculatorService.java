package com.example.calculator_hw.service;

import com.example.calculator_hw.exception.DivNullException;
import com.example.calculator_hw.exception.NullException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(int a, int b) {
        return a + b;
    }

    public String massage(int a, int b, char process, int result) throws NullException {
        if (checkNull(a, b) == true) {
            throw new NullException("Данные введены неорретно");
        }
        String firstParam = "" + a;
        String secondParam = "" + b;
        String operation = "" + process;

        return firstParam + operation + secondParam + "=" + (result + "");
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws DivNullException {
        if (b == 0) {
            throw new DivNullException("Нельзя делить на ноль");
        }
        return a / b;
    }

    public boolean checkNull(Integer a, Integer b) {
        if (a == null || b == null) {
            return true;
        } else if (a == null && b == null) {
            return true;
        }
        return false;
    }

}
