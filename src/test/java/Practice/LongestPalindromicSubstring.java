package Practice;

import java.util.Iterator;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        
        System.out.println(longestPalindrome("babda"));
    }
    //input "babda" output: "bab"

    //write a function that will check for palindrome
    //check all possible strings and find the longest
    //if input is one letter, return that letter.

    public static boolean checkPalindrome(String str) {
        for (int k = 0; k < str.length() / 2; k++) {
            if (str.charAt(k) != str.charAt((str.length() - 1 - k))) {//it had to mirror(same value) our element,
                //that's why minus 1, so if each elements is not equals to mirror element, return false
                return false;
            }
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        String result = "";
        s = s.replace(" ", "");

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (checkPalindrome(s.substring(i, j + 1))) {//nested because outer is goig thru each element
                    //inner is checking for palindrome
                    if (s.substring(i, j + 1).length() > result.length()) {
                        result = s.substring(i, j + 1);
                    }
                }
            }
        }
        return result;
    }
}
