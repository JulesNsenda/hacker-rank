package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyRegexTest
{
    @Test
    public void test_isValidIpAddress()
    {
        assertTrue(MyRegex.isValidIpAddress("192.168.10.4"));
        assertTrue(MyRegex.isValidIpAddress("255.255.255.4"));
        assertFalse(MyRegex.isValidIpAddress("256.255.255.4"));
        assertFalse(MyRegex.isValidIpAddress("255.a.255.4"));
        assertFalse(MyRegex.isValidIpAddress("I.am.not.correct"));
    }
}
