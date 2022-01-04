
import java.util.*;
class largestnumber
{

    public static String largestNumber(int[] nums)
    {
        ArrayList<String> numst = new ArrayList<>();
        for (int x : nums) {
            numst.add(String.valueOf(x));
        }
        String ans="",temp;
        long a,b;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                
                a=Long.parseLong(numst.get(i)+numst.get(j));
                b=Long.parseLong(numst.get(j)+numst.get(i));

                if(a<b)
                {
                    temp = numst.get(i);
                    numst.set(i,numst.get(j));
                    numst.set(j, temp);
                }

            }
        }

        if(numst.get(0).charAt(0) == '0')
            return "0";

        for (String z : numst) {
            ans+=z;
        }
        
        return ans;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int[] arr =new int[n];
        String ans;

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = in.nextInt();
        }

        ans=largestNumber(arr);

        System.out.println(ans);
        in.close();
    }
}