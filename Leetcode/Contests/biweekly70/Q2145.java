package Contests.biweekly70;
//2145. Count the Hidden Sequences
public class Q2145 {
    public static int numberOfArrays(int[] differences, int lower, int upper) {
        int mxv=0,mnv=0;
        int ref = 0;
        for (int difference : differences) {
            ref += difference;
            mxv = Math.max(mxv, ref);
            mnv = Math.min(mnv, ref);
        }

        int count = 0;
        for(int i=lower;i<=upper;i++){
            if(i+mxv <= upper && i+mnv >= lower)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] differences = {1,-3,4};
        int lower = 1;
        int upper = 6;
        int countOfArrays = numberOfArrays(differences,lower,upper);
        System.out.println(countOfArrays);
    }

}
