package Contests.weekly278;
//2155. All Divisions With the Highest Score of a Binary Array
import java.util.*;
public class Q2155 {
    public static List<Integer> maxScoreIndices(int[] nums) {
        int maxDisc = 0;
        int n = nums.length;
        int[] vals = new int[100001];
        List<Integer> zr = new ArrayList<>();
        List<Integer> on = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int zc=0,oc=0;
        for (int num : nums) {
            if (num == 0) {
                zc++;
            } else
                oc++;
            zr.add(zc);
            on.add(oc);
        }
        int comp;
        for(int i=0;i<=n;i++){
            if(i == 0){
                comp = oc;
            }
            else if(i == n){
                comp = zc;
            }
            else{
                int az = zr.get(i-1);
                int ao = oc - on.get(i - 1) ;
                comp = az+ao;
            }
            vals[i] = comp;
            maxDisc = Math.max(maxDisc,comp);
        }

        for(int i=0;i<=n;i++){
            if(vals[i] == maxDisc){
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,0};
        List<Integer> ans = maxScoreIndices(nums);
        for (int a:ans) {
            System.out.println(a+" ");
        }
    }
}
