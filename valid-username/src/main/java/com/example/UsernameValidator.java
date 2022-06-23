package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator
{
    private UsernameValidator()
    {
    }

    public static boolean isValidUsername(String username)
    {
        String pattern = "^([A-Z]|[a-z])\\w{7,29}$";
        Matcher matcher = Pattern.compile(pattern).matcher(username);
        return matcher.find();
    }
}
