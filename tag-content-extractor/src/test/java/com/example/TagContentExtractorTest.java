package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TagContentExtractorTest
{
    @Test
    public void test_getContent()
    {
        assertEquals("this is testing", TagContentExtractor.getContent("<h1>this is testing</h1>").orElse("None"));
        assertEquals("Nayeem loves counseling", TagContentExtractor.getContent("<h1>Nayeem loves counseling</h1>").orElse("None"));
        assertEquals("None", TagContentExtractor.getContent("<Amee>safat codes like a ninja</amee>").orElse("None"));
        assertEquals("Imtiaz has a secret crush", TagContentExtractor.getContent("<SA premium>Imtiaz has a secret crush</SA premium>").orElse("None"));
    }
}
