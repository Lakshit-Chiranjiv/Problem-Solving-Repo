package Contests.weekly273;
//2120. Execution of All Suffix Instructions Staying in a Grid

public class Q2120 {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        int m = s.length();
        int cx = startPos[0],cy = startPos[1],stps = 0;
        int[] ansArr = new int[m];
        if(n==1) return ansArr;
        for(int i=0;i<m;i++){
            for(int j=i;j<m;j++){
                if(s.charAt(j) == 'L'){
                    cy--;
                    if(cy<0){
                        cx = startPos[0];
                        cy = startPos[1];
                        ansArr[i] = stps;
                        stps = 0;
                        break;
                    }
                }
                else if(s.charAt(j) == 'R'){
                    cy++;
                    if(cy>=n){
                        cx = startPos[0];
                        cy = startPos[1];
                        ansArr[i] = stps;
                        stps = 0;
                        break;
                    }
                }
                else if(s.charAt(j) == 'U'){
                    cx--;
                    if(cx<0){
                        cx = startPos[0];
                        cy = startPos[1];
                        ansArr[i] = stps;
                        stps = 0;
                        break;
                    }
                }
                else if(s.charAt(j) == 'D'){
                    cx++;
                    if(cx>=n){
                        cx = startPos[0];
                        cy = startPos[1];
                        ansArr[i] = stps;
                        stps = 0;
                        break;
                    }
                }
                stps++;
                if(j==(m-1))
                {
                    cx = startPos[0];
                    cy = startPos[1];
                    ansArr[i] = stps;
                    stps = 0;
                }
            }
            cx = startPos[0];
            cy = startPos[1];
        }

        return ansArr;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] startPos = {0,1};
        String s = "RRDDLU";
        int[] ans = executeInstructions(n,startPos,s);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
