import java.util.*;

public class Repeatedsubstringpattern {

    public static boolean repeatedSubstringPattern(String s)
    {
        String sub;
        int ys;
        for (int i = 0; i <s.length()/2 ; i++) {
            sub=s.substring(0,i+1);
            ys=1;
            if(s.length()%sub.length()!=0)
                continue;
            for (int j = 0; j < s.length(); j+=sub.length()) {
                if(!(s.substring(j,j+sub.length()).equals(sub)))
                {
                    ys=0;
                    break;
                }
            }
            if(ys==1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        s= in.nextLine();
        System.out.println(repeatedSubstringPattern(s));
    }
}
//sureshrai10759@gmail.com