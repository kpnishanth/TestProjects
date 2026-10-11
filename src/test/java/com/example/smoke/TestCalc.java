package com.example.smoke;

import org.testng.annotations.Test;

import com.example.testingproject.Calculator;

public class TestCalc {
    Calculator calculator = new Calculator();

    @Test(groups = { "Smoke" })
    public void testAdd() {
        System.out.println("Smoke test started");
        int result = calculator.add(2, 3);
        System.out.println("Addition result: " + result);
        System.out.println("My Username is: " + System.getProperty("USERNAME"));
        System.out.println("My Password is: " + System.getProperty("PASSWORD"));
        assert result == 5 : "Addition test failed";
    }

    @Test(groups = { "Regression" })

    public void testSubtract() {
        System.out.println("regression test started");
        int result = calculator.subtract(5, 3);
        System.out.println("Subtraction result: " + result);
        assert result == 2 : "Subtraction test failed";
    }

    @Test(groups = { "Regression" })
    public void testMultiply() {
        System.out.println("regression test started");
        int result = calculator.multiply(4, 3);
        System.out.println("Multiplication result: " + result);
        assert result == 12 : "Multiplication test failed";
    }
}
