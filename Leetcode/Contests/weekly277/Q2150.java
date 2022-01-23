package Contests.weekly277;
//2150. Find All Lonely Numbers in the Array
import java.util.*;
public class Q2150 {
    public static List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> n = new ArrayList<>();
        if(nums.length == 1) {
            n.add(nums[0]);
            return n;
        }

        if(nums[1]-nums[0] > 1) n.add(nums[0]);
        for(int i=1;i<nums.length-1;i++){
            if(nums[i+1]-nums[i] <= 1 || nums[i]-nums[i-1] <= 1)
                continue;
            else
                n.add(nums[i]);
        }
        if(nums[nums.length -1]-nums[nums.length -2] > 1) n.add(nums[nums.length - 1]);

        return n;
    }

    public static void main(String[] args) {
        int[] nums = {10,6,5,8};
        List<Integer> ans = findLonely(nums);
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }
}
