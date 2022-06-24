package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TagContentExtractorTest
{
    @Test
    public void test_getContent()
    {
        assertEquals("this is testing", TagContentExtractor.getContent("<h1>this is testing</h1>").orElse("None"));
    }
}
