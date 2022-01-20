package Contests.weekly273;
//2119. A Number After a Double Reversal

public class Q2119 {

    public static boolean isSameAfterReversals(int num) {
        return num == 0 || !(num % 10 == 0);
    }

    public static void main(String[] args) {
        int num = 526;
        boolean ans = isSameAfterReversals(num);
        System.out.println(ans);
    }
}
