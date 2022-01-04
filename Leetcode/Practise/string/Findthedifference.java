import java.util.*;
public class Findthedifference {

    public static char finddifference(String s,String t)
    {
        char ans='-';
        int ind;
        String alp="abcdefghijklmnopqrstuvwxyz";
        int arr[]=new int[27];
        Arrays.fill(arr,0);
        for (char x:s.toCharArray()) {
            ind = (int)x;
            arr[ind-96]++;
        }
        for (char x:t.toCharArray()) {
            ind = (int)x;
            arr[ind-96]--;
        }
        for (int i = 0; i < 27; i++) {
            if(arr[i]!=0)
            {
                return alp.charAt(i-1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s,t;
        s=in.nextLine();
        t=in.nextLine();
        System.out.println(finddifference(s,t));
    }
}
