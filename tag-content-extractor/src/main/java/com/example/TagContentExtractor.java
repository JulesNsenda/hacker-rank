package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor
{
    private TagContentExtractor()
    {
    }

    public static String getContent(String text)
    {
        boolean matchFound = false;
        Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = r.matcher(text);

        String content = "";
        while (m.find()){
            content = m.group(2);
            matchFound = true;
        }

        if (!matchFound){
            content = "None";
        }
        return content;
    }
}
