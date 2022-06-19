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
        assertTrue(MyRegex.isValidIpAddress("000.12.12.034"));
        assertTrue(MyRegex.isValidIpAddress("121.234.12.12"));
        assertTrue(MyRegex.isValidIpAddress("23.45.12.56"));
        assertFalse(MyRegex.isValidIpAddress("00.12.123.123123.123"));
        assertFalse(MyRegex.isValidIpAddress("122.23"));
        assertFalse(MyRegex.isValidIpAddress("Hello.IP"));
    }
}
