package Contests.weekly275;
//not accepted but correct solution
//TLE
import java.util.*;
public class Q2135p1 {
    public int wordCount(String[] startWords, String[] targetWords) {
        int count = 0;
        int[] arr = new int[26];
        int s = 0;
        Arrays.fill(arr,0);
        for(int i =0;i<targetWords.length;i++)
        {
            for(int j = 0;j<startWords.length; j++)
            {
                if(targetWords[i].length() - startWords[j].length() == 1)
                {
                    for(int k=0;k<targetWords[i].length();k++)
                    {
                        int idx = (int)targetWords[i].charAt(k) - 97;
                        arr[idx]++;
                    }
                    for(int k=0;k<startWords[j].length();k++)
                    {
                        int idx = (int)startWords[j].charAt(k) - 97;
                        if(arr[idx] > 0)
                            arr[idx]--;
                    }
                    for(int k=0;k<26;k++)
                    {
                        s += arr[k];
                    }
                    if(s == 1)
                    {
                        count++;
                        Arrays.fill(arr,0);
                        s = 0;
                        break;
                    }
                    Arrays.fill(arr,0);
                    s = 0;

                }
            }
        }

        return count;
    }
}
