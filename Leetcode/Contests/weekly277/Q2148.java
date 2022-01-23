package Contests.weekly277;
//2148. Count Elements With Strictly Smaller and Greater Elements
import java.util.*;
public class Q2148 {

    public static int countElements(int[] nums) {
        if(nums.length < 3) return 0;
        Arrays.sort(nums);
        int s=-1,e=-1,c;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                s = i-1;
                break;
            }
        }
        for (int i = nums.length-2; i >= 0; i--) {
            if(nums[i] != nums[i+1]){
                e = i+1;
                break;
            }
        }
        c = e - s + 1;
        if(c<2) return 0;
        return c-2;
    }

    public static void main(String[] args) {
        int[] nums = {11,7,2,15};
        int ans = countElements(nums);
        System.out.println(ans);
    }
}
