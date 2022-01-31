package Contests.weekly278;
//2154. Keep Multiplying Found Values by Two
public class Q2154 {
    public static int findFinalValue(int[] nums, int original) {

        for(int i =0;i<nums.length;i++){
            if(nums[i] == original){
                i = -1;
                original = original * 2;
            }
        }

        return original;
    }

    public static void main(String[] args) {
        int[] nums = {5,3,6,1,12};
        int original = 3;
        int ans = findFinalValue(nums,original);
        System.out.println(ans);
    }
}
