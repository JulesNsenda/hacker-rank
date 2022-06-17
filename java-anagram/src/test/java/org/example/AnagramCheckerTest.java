package org.example;

import  static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AnagramCheckerTest
{
    @Test
    public void test_isAnagram(){
        assertTrue(AnagramChecker.isAnagram("Hello", "hello"));
        assertTrue(AnagramChecker.isAnagram("anagram", "margana"));
        assertFalse(AnagramChecker.isAnagram("anagramm", "marganaa"));
        assertTrue(AnagramChecker.isAnagram("kIng", "KinG"));
        assertTrue(AnagramChecker.isAnagram("This is a very long string test", "A long very string this test is"));
    }
}
