package com.example.testingproject.Regression;

import org.testng.annotations.Test;

public class RegressionTest {

    @Test(groups = { "Regression" })
    public void testRegression() {
        // Add your regression test logic here
        System.out.println("Running regression tests...");
    }

    @Test(groups = { "Smoke" })
    public void testSmoke() {
        // Add your smoke test logic here
        System.out.println("Running smoke tests...");
    }
}
