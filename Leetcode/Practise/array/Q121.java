package Practise.array;
//121. Best Time to Buy and Sell Stock
public class Q121 {
    public static int maxProfit(int[] prices) {
        int mp = 0;

        int[] furtherMax = new int[prices.length];
        furtherMax[prices.length-1] = prices[prices.length-1];
        for(int i = prices.length-2;i>=0;i--)
            furtherMax[i] = Math.max(prices[i],furtherMax[i+1]);

        for(int i = 0;i<prices.length;i++){
            mp = Math.max(mp,(furtherMax[i]-prices[i]));
        }

        return mp;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }
}
