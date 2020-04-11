package com.tw.restdemo;

import com.tw.restdemo.model.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();
    float result;


    @Test
    public void shouldAddNumber() {
        String input = "2+5";
        result = calculator.calculate(input);
        Assertions.assertEquals(7, result);

    }

    @Test
    public void shouldAddNumberWhenInputHaveInitialSpace() {
        String input = " 2+5";
        result = calculator.calculate(input);
        Assertions.assertEquals(7, result);

    }

    @Test
    public void shouldAddNumberWhenInputHaveSpaceBetweenNumbers() {
        String input = "2 + 5";
        result = calculator.calculate(input);
        Assertions.assertEquals(7, result);

    }

    @Test
    public void shouldAddNumberWhenInputHaveSpaceAtTheEnd() {
        String input = "2+5 ";
        result = calculator.calculate(input);
        Assertions.assertEquals(7, result);

    }

    @Test
    public void shouldAddNumberWhenInputHaveMultipleNumbers() {
        String input = "2+12+8";
        result = calculator.calculate(input);
        Assertions.assertEquals(22, result);

    }
}
