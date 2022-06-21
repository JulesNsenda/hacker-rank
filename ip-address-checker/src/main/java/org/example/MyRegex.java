package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex
{
    private static final String pattern = "((([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d?\\d|2[0-4]\\d|25[0-5]))\\b";

    public static boolean isValidIpAddress(String s)
    {
        Matcher matcher = Pattern.compile(pattern).matcher(s);
        return matcher.matches();
    }
}
