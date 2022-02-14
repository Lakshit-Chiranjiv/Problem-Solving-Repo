package Contests.weekly280;
//2169. Count Operations to Obtain Zero
public class Q2169 {
    public int countOperations(int num1, int num2) {
        if(num1==0 && num2==0)
            return 0;
        if(num1 == num2)
            return 1;
        int c = 0;
        while(num1!=0 && num2!=0){
            if(num1>=num2)
                num1 -= num2;
            else
                num2 -= num1;
            c++;
        }

        return c;
    }
}
