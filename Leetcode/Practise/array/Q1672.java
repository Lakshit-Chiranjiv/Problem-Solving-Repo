package Practise.array;
//1672. Richest Customer Wealth
public class Q1672 {
    public static int maximumWealth(int[][] accounts) {
        int maxAmt=0,curAmt=0;
        for (int[] account : accounts) {
            curAmt = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                curAmt += account[j];
            }
            maxAmt = Math.max(curAmt, maxAmt);
        }

        return maxAmt;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
}
