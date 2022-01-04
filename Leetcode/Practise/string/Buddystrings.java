import java.util.*;
public class Buddystrings {

    public static boolean buddyStrings(String s, String goal)
    {
        if(s.length()!=goal.length())
            return false;
        int[] arr = new int[27];
        int reldif=0,ys=0;
        int tmp;
        for(char x:s.toCharArray())
        {
            tmp = x;
            arr[tmp-96]++;
        }
        for(int x:arr)
        {
            if(x>=2)
            {
                ys=1;
                break;
            }
        }
        for (char x:goal.toCharArray())
        {
            tmp = x;
            arr[tmp-96]--;
        }

        for(int x:arr)
        {
            if(x!=0)
            {
                return false;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=goal.charAt(i))
                reldif++;
        }
        if(s.equals(goal) && ys==1)
            return true;

        return reldif == 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s,goal;
        s=in.nextLine();
        goal=in.nextLine();
        System.out.println(buddyStrings(s,goal));
    }
}


// abvcah     abvcah