package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.plus.apply(5, 3);
        assertEquals(8, result);
//        в стиле Hamcrest
//        assertThat(result, equalTo(8));
    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        int result = calculator.minus.apply(10, 6);
        assertEquals(4, result);
//        в стиле Hamcrest
//        assertThat(result, equalTo(4));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply.apply(4, 5);
        assertEquals(20, result);
//        в стиле Hamcrest
//        assertThat(result, equalTo(20));
    }

    @Test
    public void testByZero() {
        Calculator calculator = new Calculator();
        int result = calculator.devide.apply(8, 0);
        assertEquals(0, result);
//        в стиле Hamcrest
//        assertThat(result, equalTo(0));
    }

    @Test
    public void testPositiveNumber() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isPositive.test(10);
        assertTrue(result);
//        в стиле Hamcrest
//        assertThat(result, is(true));
    }

    @Test
    public void testNegativeNumber() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isPositive.test(-5);
        assertFalse(result);

        //в стиле Hamcrest
//        assertThat(result, is(not(true)));
    }
}
