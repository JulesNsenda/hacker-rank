package org.example;

import java.util.Arrays;

public class StringTokenizer
{
    private final String string;
    private final String delimiter;

    public StringTokenizer(String string, String delimiter)
    {
        if (string == null || string.isEmpty()){
            throw new IllegalArgumentException("String must not be null or empty");
        }

        if (delimiter == null || delimiter.isEmpty()){
            throw new IllegalArgumentException("Delimiter must not be null or empty");
        }

        this.string = string.trim();
        this.delimiter = delimiter;
    }

    public int countTokens()
    {
        return getTokens().length;
    }

    public String[] getTokens()
    {
        return string.split(delimiter);
    }
}
