package com.example;

import org.example.PatternChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PatternCheckerTest
{
    @Test
    public void test_isValid()
    {
        assertTrue(PatternChecker.isValidPattern("([A-Z])(.+)"));
        assertTrue(PatternChecker.isValidPattern("\\W+"));
        assertTrue(PatternChecker.isValidPattern("W+"));
        assertFalse(PatternChecker.isValidPattern("[AZ[a-z](a-z)"));
        assertFalse(PatternChecker.isValidPattern("batcatpat(nat"));
    }
}
