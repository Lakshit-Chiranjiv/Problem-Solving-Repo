package Practise.string;
//567. Permutation in String
import java.util.*;
public class Q567 {
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.equals(s2)) return true;

        int l1 = s1.length();
        int l2 = s2.length();
        if(l2<l1) return false;
        int l=0;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> m = new HashMap<>();

        for(int i=0;i<l1;i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
            m.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }

        for(int i=0;i<l1;i++){
            if(m.getOrDefault(s2.charAt(i),0)>0){
                map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
                if(map.getOrDefault(s2.charAt(i),0) >= 0)
                    l++;
            }
        }
        if(l ==l1) return true;

        for(int i=l1;i<l2;i++){
            if(l ==l1) return true;

            if(m.getOrDefault(s2.charAt(i),0) > 0){
                map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)-1);
                if(map.getOrDefault(s2.charAt(i),0) >= 0)
                    l++;
            }
            if(m.getOrDefault(s2.charAt(i-l1),0) > 0){
                map.put(s2.charAt(i-l1),map.getOrDefault(s2.charAt(i-l1),0)+1);
                if(map.getOrDefault(s2.charAt(i-l1),0) <= m.getOrDefault(s2.charAt(i-l1),0) && map.getOrDefault(s2.charAt(i-l1),0) > 0)
                    l--;
            }
        }

        return l == l1;
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ooolleoooleh";
        boolean ans = checkInclusion(s1,s2);
        System.out.println(ans);
    }
}

