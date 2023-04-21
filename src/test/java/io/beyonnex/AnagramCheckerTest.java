package io.beyonnex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramCheckerTest {

    private final AnagramChecker checker = new AnagramChecker();

    @Test
    void sameWords_returnsTrue() {
        assertTrue(checker.isAnagram("batman", "batman"));
    }

    @Test
    void sameWordsDifferentCase_returnsTrue() {
        assertTrue(checker.isAnagram("Batman", "bAtMaN"));
    }

    @Test
    void sameWordsDifferentPunctuations_returnsTrue() {
        assertTrue(checker.isAnagram("batman?!", "bat-man."));
    }

    @Test
    void subjectSingleWord_candidateSingleWord_returnsTrue() {
        assertTrue(checker.isAnagram("evil", "vile"));
    }

    @Test
    void subjectMultipleWordsFirst_candidateMultipleWords_returnsTrue() {
        assertTrue(checker.isAnagram("forty five", "over fifty"));
    }

    @Test
    void subjectSingleWord_candidateMultipleWords_returnsTrue() {
        assertTrue(checker.isAnagram("adultery", "true lady"));
    }

    @Test
    void subjectMultipleWords_candidateSingleWord_returnsTrue() {
        assertTrue(checker.isAnagram("true lady", "adultery"));
    }

    @Test
    void differentCase_returnsTrue() {
        assertTrue(checker.isAnagram("Tom Marvolo Riddle", "I am Lord Voldemort"));
    }

    @Test
    void punctuations_returnsTrue() {
        assertTrue(checker.isAnagram("She sells sanctuary.", "Santa; shy, less cruel"));
    }

    @Test
    void differentChars_returnsFalse() {
        assertFalse(checker.isAnagram("poison", "banana"));
    }

    @Test
    void sameCharsDifferentDuplicates_returnsFalse() {
        assertFalse(checker.isAnagram("apples", "please"));
    }
}
