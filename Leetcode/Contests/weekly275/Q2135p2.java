package Contests.weekly275;

import java.util.*;
public class Q2135p2 {
    public static String sortString(String inputString)
    {
        char[] tempArray = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static int wordCount(String[] startWords, String[] targetWords) {
        int count = 0;
        Hashtable<String, Boolean> ht = new Hashtable<>();
        for(int i=0;i<startWords.length;i++)
        {
            startWords[i] = sortString(startWords[i]);
            ht.put(startWords[i],true);
        }
        for(int i =0;i<targetWords.length;i++)
        {
            for(int j = 0;j<targetWords[i].length(); j++)
            {
                String st = sortString(targetWords[i].substring(0,j+1));
                if(ht.get(st) == true)
                {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] start = {"ant","act","tack"};
        String[] target = {"tack","act","acti"};
        int c = wordCount(start,target);
        System.out.println(c);
    }
}
