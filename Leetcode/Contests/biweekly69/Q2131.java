package Contests.biweekly69;
//2131. Longest Palindrome by Concatenating Two Letter Words
import java.util.*;
public class Q2131 {

    public static int longestPalindrome(String[] words) {
        int longestPalindromeLength = 0;

        HashMap<String ,Integer> occurs = new HashMap<>();

        for (String word : words) {
            String rv = word.charAt(1)  + "" + word.charAt(0);
            if (occurs.containsKey(rv)) {
                longestPalindromeLength += 4;
                occurs.put(rv, occurs.get(rv) - 1);
                if (occurs.get(rv) == 0)
                    occurs.remove(rv);
                continue;
            }

            occurs.put(word, occurs.getOrDefault(word, 0) + 1);
        }

        for (String k : occurs.keySet()) {
            if (occurs.get(k) == 1 && (k.charAt(1) + "" + k.charAt(0)).equals(k)) {
                longestPalindromeLength += 2;
                break;
            }
        }

        return longestPalindromeLength;
    }

    public static void main(String[] args) {
        String[] words = {"lc","cl","gg"};
        int longestPalindromeLength = longestPalindrome(words);
        System.out.println(longestPalindromeLength);
    }
}
