package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWordFinder
{
    private DuplicateWordFinder()
    {
    }

    public static void removeDuplicate(String s)
    {
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";

        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher m = p.matcher(s);

        while (m.find()){
            s = s.replaceAll(m.group(0), m.group(1));
        }
    }
}
