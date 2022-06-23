package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsernameValidatorTest
{
    @Test
    public void test_isValidUsername()
    {
        assertTrue(UsernameValidator.isValidUsername("Samantha"));
        assertTrue(UsernameValidator.isValidUsername("Samantha_1"));
        assertTrue(UsernameValidator.isValidUsername("JuliaZ007"));
        assertFalse(UsernameValidator.isValidUsername("Julia"));
        assertFalse(UsernameValidator.isValidUsername("1Samantha"));
        assertFalse(UsernameValidator.isValidUsername("Samantha?10_2A"));
        assertFalse(UsernameValidator.isValidUsername("Julia@007"));
        assertFalse(UsernameValidator.isValidUsername("_Julia007"));
    }
}
