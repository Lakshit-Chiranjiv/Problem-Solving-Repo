package Contests.weekly275;
//2133. Check if Every Row and Column Contains All Numbers

import java.util.*;
public class Q2133 {

    public static boolean checkValid(int[][] matrix) {
        int[] arr = new int[matrix.length];
        Arrays.fill(arr,0);
        int checkVal = 0;
        for (int i = 0;i < matrix.length;i++) {
            checkVal++;
            for (int j = 0; j < matrix[0].length; j++) {
                arr[matrix[i][j] - 1]++;
            }
            for (int j : arr) {
                if (j != checkVal) return false;
            }
            checkVal++;
            for (int j = 0; j < matrix[0].length; j++) {
                arr[matrix[j][i] - 1]++;
            }
            for (int j : arr) {
                if (j != checkVal) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix ={{1,2,3},{3,1,2},{2,3,1}};
        int[][] matrix2 ={{1,1,1},{1,2,3},{1,2,3}};
        boolean checkValidity = checkValid(matrix);
        System.out.println(checkValidity);
    }
}
