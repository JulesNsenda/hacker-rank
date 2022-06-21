package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuplicateWordFinderTest
{
    @Test
    public void test_removeDuplicate()
    {
        assertEquals("Goodbye bye world", DuplicateWordFinder.getUnDuplicateString("Goodbye bye bye world world world"));
        assertEquals("Sam went to his business", DuplicateWordFinder.getUnDuplicateString("Sam went went to to to his business"));
        assertEquals("Reya is the best player in eye game", DuplicateWordFinder.getUnDuplicateString("Reya is is the the best player in eye eye game"));
        assertEquals("in inthe", DuplicateWordFinder.getUnDuplicateString("in inthe"));
        assertEquals("Hello Ab", DuplicateWordFinder.getUnDuplicateString("Hello hello Ab aB"));
    }
}
