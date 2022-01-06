package Contests.weekly274;
//2125. Number of Laser Beams in a Bank
import java.util.*;
public class Q2125 {
    public static int numberOfBeams(String[] bank) {
        int numOfBeams = 0,lastNonZero=0,numOfDevicesInRow=0;
        ArrayList<Integer> deviceCountArray = new ArrayList<>();
        int m = bank.length;
        int n = bank[0].length();
        for (String s : bank) {
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == '1') numOfDevicesInRow++;
            }
            deviceCountArray.add(numOfDevicesInRow);
            numOfDevicesInRow = 0;
        }

        for (int i = 0; i < m; i++) {
            if(i!=0)
                numOfBeams += deviceCountArray.get(i) * deviceCountArray.get(lastNonZero);
            if(deviceCountArray.get(i) != 0) lastNonZero=i;
        }

        return numOfBeams;
    }

    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        String[] bank2 = {"000","000","111","000","001","110"};
        int ans = numberOfBeams(bank2);
        System.out.println("ans = "+ans);
    }
}
