package Contests.biweekly69;
//5962. Longest Palindrome by Concatenating Two Letter Words
import java.util.*;
public class Q5962 {

    static ArrayList<String> permutedList = new ArrayList<>();

    public static String swapAndJoin(String[] words,int i,int j){
        String temp;
        temp = words[i] ;
        words[i] = words[j];
        words[j] = temp;
        String finalJoin = "";
        for (String word : words) {
            finalJoin += word;
        }
        return finalJoin;
    }

    public static void permuteAndStore(String[] words,int l,int r){
        String str;
        if (l == r)
            permutedList.add(words[l]);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swapAndJoin(words,l,i);
                permuteAndStore(words, l+1, r);
                str = swapAndJoin(words,l,i);
            }
        }
    }

    public static boolean isPalindrome(String str){
        int l=0,r=str.length()-1;
        while (l<=r){
            if(str.charAt(l) != str.charAt(r))
                return false;
        }
        return true;
    }

    public static int longestPalindrome(String[] words) {
        int longestPalindromeLength = 0;
        permuteAndStore(words,0,words.length-1);
        for (String s : permutedList) {
            System.out.println(s);
            if (isPalindrome(s) && s.length() > longestPalindromeLength)
                longestPalindromeLength = s.length();
        }
        return longestPalindromeLength;
    }

    public static void main(String[] args) {
        String[] words = {"lc","cl","gg"};
        int longestPalindromeLength = longestPalindrome(words);
        System.out.println(longestPalindromeLength);
    }
}
