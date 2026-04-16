package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramCheckerTest {

    @Test
    public void testAnagram() {
        assertTrue(AnagramChecker.isAnagram("listen", "silent"));
    }

    @Test
    public void testNotAnagram() {
        assertFalse(AnagramChecker.isAnagram("hello", "world"));
    }
}