package Practise.array;
//454. 4Sum II
import java.util.*;
public class Q454 {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int tupleCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int k : nums3)
            for(int l : nums4)
                map.put(k + l, map.getOrDefault(k + l, 0) + 1);
        for(int i : nums1)
            for(int j : nums2)
                tupleCount += map.getOrDefault(-(i + j), 0);
        return tupleCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {-2,-1};
        int[] nums3 = {-1,2};
        int[] nums4 = {0,2};
        int ans = fourSumCount(nums1,nums2,nums3,nums4);
        System.out.println(ans);
    }
}
