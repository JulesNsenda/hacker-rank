package com.example;

import java.util.Optional;

public class TagContentExtractor
{
    private TagContentExtractor()
    {
    }

    public static Optional<String> getContent(String text)
    {
        String startTag = getStartTag(text).orElse("");
        String endTag = getEndTag(text).orElse("");

        if (!isCorrespondingEndTag(startTag, endTag)){
            return Optional.empty();
        }

        return Optional.of(text.substring(text.indexOf(startTag) + startTag.length(), text.lastIndexOf(endTag)));
    }

    private static boolean isCorrespondingEndTag(String startTag, String endTag)
    {
        if (!endTag.contains("/")){
            return false;
        }

        endTag = endTag.replaceAll("/", "");

        return startTag.equals(endTag);
    }

    private static Optional<String> getStartTag(String text)
    {
        if (!text.contains("<")){
            return Optional.empty();
        }

        String tag = text.substring(text.indexOf('<'), text.indexOf('>') + 1);

        return !tag.isEmpty() ? Optional.of(tag) : Optional.empty();
    }

    private static Optional<String> getEndTag(String text)
    {
        if (!text.contains("</")){
            return Optional.empty();
        }

        String tag = text.substring(text.lastIndexOf("</"), text.lastIndexOf('>') + 1);

        return !tag.isEmpty() ? Optional.of(tag) : Optional.empty();
    }
}
