package Contests.weekly278;
//2156. Find Substring With Given Hash Value
public class Q2156 {
    public String subStrHash(String s, int power, int modulo, int k, int hashValue) {
        if(k==s.length()) return s;
        long chash = 0;
        for(int i=0;i<(s.length()-k+1);i++){
            String sub = s.substring(i,i+k);
            for(int j=0;j<sub.length();j++){
                chash += (((int)sub.charAt(j)) - 96) * Math.pow(power,j);
                System.out.println("sub = "+sub+" chash = "+chash);
            }
            System.out.println("sub = "+sub+" chash = "+chash);
            chash = chash%modulo;
            System.out.println("sub = "+sub+" chash = "+chash);
            if((int)chash == hashValue) return sub;
        }
        return "";
    }
}
