package Practise.array;
//560. Subarray Sum Equals K
import java.util.*;
public class Q560 {
    public static int subarraySum(int[] nums, int k) {
        if(nums.length==1){
            if(nums[0]==k)
                return 1;
            else
                return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] pref = new int[nums.length+1];
        pref[0] = 0;
        map.put(0,1);
        int c=0;
        for(int i=1;i<=nums.length;i++){
            pref[i] = nums[i-1]+pref[i-1];
            if(map.getOrDefault(pref[i]-k,0)>0)
                c += map.getOrDefault(pref[i]-k,0) ;
            map.put(pref[i],map.getOrDefault(pref[i],0)+1);
        }

        return c;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        int ans = subarraySum(nums,k);
        System.out.println(ans);
    }
}
