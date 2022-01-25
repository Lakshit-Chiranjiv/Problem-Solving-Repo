package Contests.biweekly70;
//2144. Minimum Cost of Buying Candies With Discount
import java.util.*;
public class Q2144 {
    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int totalCost = 0;
        if(cost.length == 1) return cost[0];
        if(cost.length == 2) return cost[0]+cost[1];
        int c = 0;
        for(int i=cost.length-1;i>=0;i--){

            if(c<2){
                totalCost = totalCost + cost[i];
                c++;
            }
            else
                c=0;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] costs = {6,5,7,9,2,2};
        int totalCost = minimumCost(costs);
        System.out.println(totalCost);
    }
}
