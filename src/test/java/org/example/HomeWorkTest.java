package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkTest {

    @ParameterizedTest
    @CsvSource({
            "abcddcba,abcd",
            "abcddcbaX,dcbaX",
            "abcabcbb,abc",
            "bbbbb,b",
            "pwwkew,wke",
            "a,a",
            "'',''",
            "qqqqqffg,qf",
            "qqffqfgqf,qfg",
            "au,au",
            "dvsdta,vsdta",
            "dvdf,vdf"
    })
    void lengthOfLongestSubstringA(String s, String expected) {
        HomeWork homeWork = new HomeWork();
        assertEquals(expected, homeWork.findMaxSubstring(s));
    }
}