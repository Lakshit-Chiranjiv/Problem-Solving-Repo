package Practise.stacks;
//402. Remove K Digits
import java.util.*;
public class Q402 {
    public String removeKdigits(String num, int k) {
        if(num.length() == k || num.equals("0")) return "0";

        Stack<Integer> s = new Stack<>();
        char[] ch = num.toCharArray();
        int[] nch = new int[ch.length];

        for (int i=0;i<ch.length;i++) {
            nch[i] = (int)ch[i] - 48;
        }
        s.push(nch[0]);
        for (int i=1;i<nch.length;i++) {
            while(!s.empty() && nch[i] < s.peek() && k>0){
                s.pop();
                k--;
            }
            if(!s.empty() || nch[i] != 0)
                s.push(nch[i]);
        }

        String r = "";
        while(!s.empty()){
            r = String.valueOf(s.peek()) + r;
            s.pop();
        }

        if(r.equals(num) || k>0){
            if(k>=r.length())
                return "0";
            r = r.substring(0,r.length()-k);
        }

        return (r.equals("")?"0":r);
    }
}
