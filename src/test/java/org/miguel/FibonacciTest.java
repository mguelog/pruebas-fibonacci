package org.miguel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void shouldFibonacciReturnZeroIfNumberIsZero(){
        Fibonacci fibonacci = new Fibonacci();

        int expectedValue = 0;
        int obtainedValue = fibonacci.fibonacci(0);

        assertEquals(expectedValue, obtainedValue);
    }
}
