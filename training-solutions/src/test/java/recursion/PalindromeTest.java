package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testIsPalindrome() {

     Palindrome palindrome = new Palindrome()   ;

        assertEquals(true, palindrome.isPalindrome("racecar"));
        assertEquals(false, palindrome.isPalindrome("racrtrtgecar"));
        assertEquals(false, palindrome.isPalindrome("eur"));
        assertEquals(true, palindrome.isPalindrome("c"));
        assertEquals(true, palindrome.isPalindrome(""));
        assertEquals(true, palindrome.isPalindrome("palalap"));
        assertEquals(true, palindrome.isPalindrome("pp"));
    }


}