package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex
{
    private static final String pattern = "((\\d{1,2}|([01])\\d{2}|2[0-4]\\d|25[0-5])(\\.)?){4}";

    public static boolean isValidIpAddress(String s)
    {
        Matcher matcher = Pattern.compile(pattern).matcher(s);
        return matcher.matches();
    }
}
