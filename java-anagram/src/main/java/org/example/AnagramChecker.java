package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AnagramChecker
{
    private AnagramChecker()
    {
    }

    public static boolean isAnagram(String a, String b)
    {
        Map<Set<Character>, Integer> aMap = getMap(a.toLowerCase());

        Map<Set<Character>, Integer> bMap = getMap(b.toLowerCase());

        return aMap.equals(bMap);
    }

    private static Map<Set<Character>, Integer> getMap(String s)
    {
        Map<Set<Character>, Integer> map = new HashMap<>();

        for (Character c1 : s.toCharArray()){
            Set<Character> chars = new HashSet<>();
            int count = 0;
            chars.add(c1);
            for (Character c2 : s.toCharArray()){
                if (c1 == c2){
                    count += 1;
                }
            }
            map.put(chars, count);
        }

        return map;
    }
}
