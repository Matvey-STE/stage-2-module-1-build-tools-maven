package com.epam.demo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    @Test
    void isAllPositiveNumbersTest() {
        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("10");
        numbers.add("23");
        numbers.add("12");

        boolean expected = true;

        boolean result = Utils.isAllPositiveNumbers(numbers);

        assertEquals(expected, result);
    }
    @Test
    void isOneNegativeOfAllPositiveNumbersTest() {
        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("-2");
        numbers.add("10");
        numbers.add("23");
        numbers.add("12");
        boolean expected = false;

        boolean result = Utils.isAllPositiveNumbers(numbers);

        assertEquals(expected, result);
    }
    @Test
    void isOneZeroOfAllPositiveNumbersTest() {
        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("0");
        numbers.add("10");
        numbers.add("23");
        numbers.add("12");
        boolean expected = false;

        boolean result = Utils.isAllPositiveNumbers(numbers);

        assertEquals(expected, result);
    }

}