package Contests.weekly274;
//2124. Check if All A's Appears Before All B's
import java.util.*;
public class Q2124 {

    public static boolean checkString(String s) {
        int ai=-1,bi=100;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') ai = i;
            if(s.charAt(i) == 'b') bi = i;
            if(ai>bi) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "aaavfbbabjhhcddv";
        boolean ans = checkString(s);
        System.out.println("ans = "+ans);
    }
}
