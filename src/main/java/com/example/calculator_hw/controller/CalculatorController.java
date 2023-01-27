package com.example.calculator.controller;

import com.example.calculator.exception.DivNullException;
import com.example.calculator.exception.NullException;
import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator")
    public String greetings() {
        return this.calculatorService.greetings();
    }

    @GetMapping("/calculator/plus")
    public String plus(@RequestParam int a, @RequestParam int b) throws NullException {

        return this.calculatorService.massage(a, b, (char) 43, calculatorService.plus(a, b));
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam int a, @RequestParam int b) throws NullException {
        return this.calculatorService.massage(a, b, (char) 45, calculatorService.minus(a, b));
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam int a, @RequestParam int b) throws NullException {
        return this.calculatorService.massage(a, b, (char) 42, calculatorService.multiply(a, b));
    }
    @GetMapping("/calculator/divide")
    public String divide(@RequestParam int a, @RequestParam int b) throws DivNullException, NullException {
        return this.calculatorService.massage(a, b, (char) 47, calculatorService.divide(a, b));
    }

}
