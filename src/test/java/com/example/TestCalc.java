package com.example;

import org.testng.annotations.Test;

import com.example.testingproject.Calculator;

public class TestCalc {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        System.out.println("Addition result: " + result);
        assert result == 5 : "Addition test failed";
    }

    @Test

    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        System.out.println("Subtraction result: " + result);
        assert result == 2 : "Subtraction test failed";
    }

    @Test(tags = "division")
    public void testMultiply() {
        int result = calculator.multiply(4, 3);
        System.out.println("Multiplication result: " + result);
        assert result == 12 : "Multiplication test failed";
    }
}
