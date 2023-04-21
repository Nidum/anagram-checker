package io.beyonnex;

import java.util.Arrays;

public class AnagramChecker {
    boolean isAnagram(String subject, String candidate) {
        var cleanSubject = lettersOnly(subject);
        var cleanAnagram = lettersOnly(candidate);
        return Arrays.equals(cleanSubject, cleanAnagram);
    }

    private static char[] lettersOnly(String input) {
        char[] subjectChars = input.replaceAll("[^a-zA-Z]", "")
                .toLowerCase()
                .toCharArray();
        Arrays.sort(subjectChars);
        return subjectChars;
    }
}
