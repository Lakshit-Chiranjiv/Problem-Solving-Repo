package Contests.weekly275;
//2134. Minimum Swaps to Group All 1's Together II
//not done
import java.util.*;
public class Q2134 {
    public static int minSwaps(int[] nums) {
        ArrayList<Integer> oneIdxs = new ArrayList<>();
        int inBetweenZeros = 0;
        int countOnes = 0,lastOneIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) oneIdxs.add(i);
        }
        countOnes = oneIdxs.size();
        if(countOnes == 1) return 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == 1) lastOneIdx=i;
            if(nums[i] == 0 && lastOneIdx != -1){
                inBetweenZeros++;
            }
        }
        if(nums[nums.length-1] != 1){
            int sub = nums.length -1 - lastOneIdx;
            inBetweenZeros -= sub;
        }

        return 0;
    }

    public static void main(String[] args) {

    }
}
