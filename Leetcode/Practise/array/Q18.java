package Practise.array;
//18. 4Sum
import java.util.*;
public class Q18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {


        Map<Integer, List<Integer>> map = new HashMap<>();

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        if(nums.length<3) return ans;
        long currSum = 0;
        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if(i != j){
                    sub.add(i);
//                    System.out.println(sub);
                    sub.add(j);
//                    System.out.println(sub);
                    map.put(nums[i]+nums[j], sub);
                    for (Map.Entry<Integer, List<Integer>> set :
                            map.entrySet()) {

                        // Printing all elements of a Map
                        System.out.println(set.getKey() + " = "
                                + set.getValue());
                    }
                    sub.clear();
                }
            }
        }


        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if(i != j){
                    currSum = nums[i]+nums[j];
                    sub = map.get((int)(target-currSum));
                    sub.add(i);
                    sub.add(j);
                    Set<Integer> st = new HashSet<>(sub);
                    if(st.size()==4)
                        ans.add(sub);
                    sub.clear();
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> ans = fourSum(nums,target);
        for (List<Integer> an : ans) {
            for (int j = 0; j < 4; j++) {
                System.out.print(an.get(j) + " ");
            }
            System.out.println();
        }
    }
}
