package de.neuefische.dennis.entwicklerheld.anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void yes() {
        //Given are two Strings "eat" and "tea" .
        String str1 = "eat";
        String str2 = "tea";

        // When the function isAnagram() called with these Strings should return true .
        boolean actual = Anagram.isAnagram(str1, str2);

        //This should work with other anagrams as well. Word pairs of the same word are anagrams as well in this challenge.
        assertEquals(true, actual);
    }
    @Test
    void no() {
        //Given are two Strings "eat" and "ears" .
        String str1 = "eat";
        String str2 = "ears";

        // When the function isAnagram() called with these Strings should return false .
        boolean actual = Anagram.isAnagram(str1, str2);

        //This should work with other anagrams as well. Word pairs of the same word are anagrams as well in this challenge.
        assertEquals(false, actual);
    }
}