package Contests.weekly277;
//2149. Rearrange Array Elements by Sign
import java.util.*;
public class Q2149 {
    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pn = new ArrayList<>();
        ArrayList<Integer> nn = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                pn.add(nums[i]);
            else
                nn.add(nums[i]);
        }
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(i%2 == 0)
                nums[i] = pn.get(a++);
            else
                nums[i] = nn.get(b++);
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(nums);
        for (int an : ans) {
            System.out.print(an+" ");
        }

    }
}
