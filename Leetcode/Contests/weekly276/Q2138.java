package Contests.weekly276;
//2138. Divide a String Into Groups of Size k
import java.util.*;
public class Q2138 {
    public static String[] divideString(String s, int k, char fill) {
        ArrayList<String> ans = new ArrayList<String>();
        String gs = "";
        for(int i =0 ;i<s.length();i++)
        {
            if((i+1) % k ==  0)
            {
                gs = gs + s.charAt(i);
                ans.add(gs);
                gs = "";
            }
            else
                gs = gs + s.charAt(i);
        }
        int rem =( k - (s.length()%k))%k;
        while((rem--) != 0)
            gs = gs + String.valueOf(fill);
        if((s.length()%k) != 0)
            ans.add(gs);
        String[] arr = new String[ans.size()];
        arr = ans.toArray(arr);

        return arr;
    }

    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        String[] ans = divideString(s,k,fill);
        for (String an : ans) {
            System.out.println(an + ",");
        }
    }
}
