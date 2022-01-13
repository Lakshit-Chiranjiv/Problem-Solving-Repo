package Contests.weekly275;
//2134. Minimum Swaps to Group All 1's Together II
import java.util.*;
public class Q2134 {
    public static int minSwaps(int[] nums) {
        int[] dbnums = new int[nums.length * 2];
        int countZeros = 0;
        int countOnes = 0,minZeros=Integer.MAX_VALUE;
        for (int num : nums) {
            if (num == 1) countOnes++;
        }
        if(countOnes == nums.length || countOnes == 0 || countOnes == 1)
            return 0;
        System.arraycopy(nums, 0, dbnums, 0, nums.length);
        System.arraycopy(nums, 0, dbnums, 0 + nums.length, nums.length);

        for (int i = 0; i < countOnes; i++) {
            if(dbnums[i] == 0) countZeros++;
        }

        for (int i = countOnes; i < dbnums.length; i++) {
            if(dbnums[i - countOnes] == 0) countZeros--;
            if(dbnums[i] == 0) countZeros++;
            minZeros = Math.min(countZeros,minZeros);
        }

        return minZeros;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,0,1,1,0};
        int swapsNeeded = minSwaps(nums);
        System.out.println(swapsNeeded);
    }
}
