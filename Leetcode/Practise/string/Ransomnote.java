import java.util.*;
public class Ransomnote {

    public static boolean canConstruct(String ransomNote, String magazine)
    {
        if(ransomNote.length()>magazine.length())
            return false;
        char[] arrc = new char[27];
        int[] arr = new int[27];
        Arrays.fill(arrc,'a');
        Arrays.fill(arr,0);
        int tmp;
        for (char x:ransomNote.toCharArray())
        {
            tmp = x;
            arr[tmp-96]++;
            arrc[tmp-96] = 'p';
        }

        for (char x:magazine.toCharArray())
        {
            tmp = x;
            arr[tmp-96]--;
            if(arr[tmp-96] == 0)
                arrc[tmp-96] = 'a';
        }

        for (char x:arrc)
        {
            if(x=='p')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String r,m;
        r=in.nextLine();
        m=in.nextLine();
        System.out.println(canConstruct(r,m));
    }
}
