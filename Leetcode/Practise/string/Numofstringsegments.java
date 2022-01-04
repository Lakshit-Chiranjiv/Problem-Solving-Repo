import java.util.*;

public class Numofstringsegments {

    public static int countSegments(String s)
    {
        s=s.trim();
        if(s.equals(""))
            return 0;
        int count=0;
        for (int i = 0; i<s.length();i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
                count++;
        }
        return count+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s;
        s=in.nextLine();
        System.out.println(countSegments(s));

    }

}
