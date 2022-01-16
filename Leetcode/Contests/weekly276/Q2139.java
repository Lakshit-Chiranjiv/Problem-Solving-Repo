package Contests.weekly276;
//2139. Minimum Moves to Reach Target Score
public class Q2139 {
    public static int minMoves(int target, int maxDoubles) {
        if(target == 1) return 0;
        if(maxDoubles == 0)
            return target - 1;
        if(target % 2 == 0)
        {
            return minMoves((target/2),maxDoubles-1) + 1;
        }
        else
        {
            return minMoves((target/2),maxDoubles-1) + 2;
        }
    }
    public static void main(String[] args) {
        int target = 19;
        int maxDoubles = 4;
        int minimumMoves = minMoves(target,maxDoubles);
        System.out.println(minimumMoves);
    }
}
