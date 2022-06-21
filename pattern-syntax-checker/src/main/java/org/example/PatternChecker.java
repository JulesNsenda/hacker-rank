package org.example;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternChecker
{
    private PatternChecker()
    {
    }

    public static boolean isValidPattern(String pattern)
    {
        try {
            Pattern.compile(pattern);
            return true;
        }catch (PatternSyntaxException e){
            return false;
        }
    }
}
