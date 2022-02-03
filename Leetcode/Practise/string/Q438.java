package Practise.string;
//438. Find All Anagrams in a String
import java.util.*;
public class Q438 {

    public static boolean checkAnagram(int[] freq) {
        for (int j : freq) {
            if (j != 0)
                return false;
        }
        return true;
    }
    public static List<Integer> findAnagrams2(String s, String p) {

        List<Integer> ans = new ArrayList<>();
        int pl = p.length();
        int sl = s.length();
        if(pl>sl) return ans;
        char[] tempArray = s.toCharArray();
        Arrays.sort(tempArray);
        String ss = new String(tempArray);
        tempArray = p.toCharArray();
        Arrays.sort(tempArray);
        String ps = new String(tempArray);
        if(ps.equals(ss)){
            ans.add(0);
            return ans;
        }

        int[] arr = new int[26];

        for(int i =0;i<pl;i++){
            arr[(int)p.charAt(i)-97]++;
            arr[(int)s.charAt(i)-97]--;
        }
        int z=0;
        for(int i =0;i<(sl-pl);i++){
            if(checkAnagram(arr))
                ans.add(i);
            arr[(int)s.charAt(i)-97]++;
            arr[(int)s.charAt(i+pl)-97]--;
            z=i;
        }

        if(checkAnagram(arr))
            ans.add(z+1);

        return ans;
    }

//    correct but TLE
    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();
        int pl = p.length();
        int sl = s.length();
        char[] tempArray = s.toCharArray();
        Arrays.sort(tempArray);
        String ss = new String(tempArray);
        tempArray = p.toCharArray();
        Arrays.sort(tempArray);
        String ps = new String(tempArray);
        if(ps.equals(ss)){
            ans.add(0);
            return ans;
        }

        String temp = "";

        for(int i =0;i<(sl-pl+1);i++){
            temp = s.substring(i,i+pl);
            tempArray = temp.toCharArray();
            Arrays.sort(tempArray);
            temp = new String(tempArray);
            if(temp.equals(ps))
                ans.add(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p ="abc";
        List<Integer> ans = findAnagrams2(s,p);
        for (int a:ans) {
            System.out.print(a+" ");
        }
    }
}
