package Practise.array;
//78. Subsets
import java.util.*;
public class Q78 {
    public List<List<Integer>> ans = new ArrayList<>();

    public void fillsubs(int[] nums,int k,List<Integer> sub){

        if(nums.length <= k) {
            ans.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[k]);
        fillsubs(nums,k+1,sub);
        sub.remove(sub.size()-1);
        fillsubs(nums,k+1,sub);

    }



    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> sub = new ArrayList<>();
        if(nums.length == 0) return ans;
        fillsubs(nums,0,sub);
        return ans;
    }
}
