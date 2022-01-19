package Contests.weekly276;
//2140. Solving Questions With Brainpower
//Points2 is correct but TLE
//Points is accepted
public class Q2140 {
    static long[] dp;
    public static long Points(int idx,int[][] questions,int n) {

        if(idx>=n) return 0;
        if(dp[idx] > 0) return dp[idx];
        int pts = questions[idx][0];
        int pwr = questions[idx][1];

        long pt1 = pts + Points(idx+pwr+1,questions,n);
        long pt2 = Points(idx+1,questions,n);

        dp[idx] = Math.max(pt1,pt2);
        return dp[idx];
    }

    public static long Points2(int idx,int[][] questions,int n) {

        if(idx>=n) return 0;
        int pts = questions[idx][0];
        int pwr = questions[idx][1];

        long pt1 = pts + Points(idx+pwr+1,questions,n);
        long pt2 = Points(idx+1,questions,n);

        return Math.max(pt1,pt2);
    }


    public static long mostPoints(int[][] questions) {
        dp = new long[questions.length];
        return Points(0,questions,questions.length);
    }

    public static void main(String[] args) {
        int[][] questions = {{3,2},{4,3},{4,4},{2,5}};
        long maxpts = mostPoints(questions);
        System.out.println(maxpts);
    }
}
