package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringTokenizerTest
{
    @Test
    public void test_getCount()
    {
        StringTokenizer tokenizer = new StringTokenizer("This is a test. Isn't it?", "\\W+");
        assertEquals(7, tokenizer.countTokens());
        StringTokenizer b = new StringTokenizer("           YES      leading spaces        are valid,    problemsetters are         evillllll", "\\W+");
        assertEquals(8, b.countTokens());
    }

    @Test
    public void test_getTokens()
    {
        StringTokenizer a = new StringTokenizer("This is a test. Isn't it?", "\\W+");
        assertArrayEquals(new String[]{"This", "is", "a", "test", "Isn", "t", "it"}, a.getTokens());
        StringTokenizer b = new StringTokenizer("Some more random-tests to see if all is fine!", "\\W+");
        assertArrayEquals(new String[]{"Some", "more", "random", "tests", "to", "see", "if", "all", "is", "fine"}, b.getTokens());
        StringTokenizer c = new StringTokenizer("           YES      leading spaces        are valid,    problemsetters are         evillllll", "\\W+");
        assertArrayEquals(new String[]{"YES", "leading", "spaces", "are", "valid", "problemsetters", "are", "evillllll"}, c.getTokens());
    }

    @Test
    public void test_throwError()
    {
        assertThrows(IllegalArgumentException.class, () -> new StringTokenizer("", "\\W+"));
        assertThrows(IllegalArgumentException.class, () -> new StringTokenizer("This is a test", ""));
    }
}
