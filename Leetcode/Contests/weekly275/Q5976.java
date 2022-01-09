package Contests.weekly275;
//5976. Check if Every Row and Column Contains All Numbers

import java.util.*;
public class Q5976 {

    public static boolean checkValid(int[][] matrix) {
        int[] arr = new int[matrix.length];
        Arrays.fill(arr,0);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                arr[anInt - 1]++;
            }
        }

        for (int j : arr) {
            if (j != arr.length) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},{3,1,2},{2,3,1}};
        int[][] matrix2 ={{1,1,1},{1,2,3},{1,2,3}};
        boolean checkValidity = checkValid(matrix2);
        System.out.println(checkValidity);
    }
}
