package de.neuefische.dennis.entwicklerheld.anagram;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String firstWord, String secondWord) {
        //make spaces between words go away (eat sleep -> eatsleep)
        firstWord.replaceAll("\\s", "");
        secondWord.replaceAll("\\s","");

        // initialize the status as true, so it can be false if there is no anagram
        boolean status = true;

        // if 1st word is not same length as 2nd word, make status return false
        if (firstWord.length() != secondWord.length()) status = false;
        //else make the Strings lowercase and put them in an Array for comparison
        char[] ArrayFirstWord = firstWord.toLowerCase().toCharArray();
        char[] ArraySecondWord = secondWord.toLowerCase().toCharArray();
        //sort the Array to compare
        Arrays.sort(ArrayFirstWord);
        Arrays.sort(ArraySecondWord);
        status = Arrays.equals(ArrayFirstWord, ArraySecondWord);
        //   throw new Error("No Implementation");
        return status;
    }

}