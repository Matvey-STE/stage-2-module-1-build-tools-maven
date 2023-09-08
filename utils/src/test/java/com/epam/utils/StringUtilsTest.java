package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void isPositiveNumberTest() {
        String number = "12";
        boolean expected = true;

        boolean result = StringUtils.isPositiveNumber(number);

        assertEquals(expected, result);
    }
    @Test
    void isPositiveNumberWithNegativeTest() {
        String number = "-13";
        boolean expected = false;

        boolean result = StringUtils.isPositiveNumber(number);

        assertEquals(expected, result);
    }
    @Test
    void isPositiveNumberWithZeroTest() {
        String number = "0";
        boolean expected = false;

        boolean result = StringUtils.isPositiveNumber(number);

        assertEquals(expected, result);
    }

}