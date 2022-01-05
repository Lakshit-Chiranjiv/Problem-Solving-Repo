package arrays;
    //sum of infinite array
import java.util.*;
public class InfiniteArraySum {

    //accepted solution
    public static List<Integer> sumInRanges2(int[] arr, int n, List<List<Long>> queries, int q) {
        long M = 1000000007,L,R,a;
        List<Integer> ans = new ArrayList<>();
        ArrayList<Integer> pref_arr = new ArrayList<>();
        pref_arr.add(0);
        for (int i = 0; i < n; i++) {
            pref_arr.add((int) ((arr[i]%M + pref_arr.get(i)%M)%M));
        }
        for (int i = 0;i<q;i++) {
            L = queries.get(i).get(0);
            R = queries.get(i).get(1);
            L--;
            a = (pref_arr.get((int) (R%n)) - pref_arr.get((int) (L%n)) + ((pref_arr.get(n) *((R/n - L/n)%M))))%M;
            ans.add((int) ((a+M)%M));
        }
        return ans;
    }

    //correct for single cases but not accepted
    //kind of ans is changing depending on the query number
    //like if 1 5 query is at 3rd position it returns 77 instead of 55
    //and if 1 5 query is at 4th position it returns 88 instead of 55
    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {

        // Write your code here!
        long M = 1000000007,L,R,a = 0;
        ArrayList<Long> pref_arr = new ArrayList<>();
        pref_arr.add((long) arr[0]);

        for (int i = 1; i < n; i++) {
            pref_arr.add((pref_arr.get(i-1) + arr[i])%M);
        }

//        for (int i = 0; i < n; i++) {
//            System.out.print(pref_arr.get(i)+",");
//        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0;i<q;i++)
        {
            L = queries.get(i).get(0);
            R = queries.get(i).get(1);
            if((R-L)%n == (n-1))
            {
                a = (((R-L+1)/n) * pref_arr.get(n-1))%M;
            }
            else {
                a += (((R-L)/n) * pref_arr.get(n-1))%M;
                if(R-L == 0){
                    if(R%n == 0)
                        a += (arr[(n-1)])%M;
                    else
                        a += (arr[(int) (R%n - 1)])%M;
                }
                else {
                    R = R%n;
                    L = L%n;
                    if(R == L){
                        if(R == 0)
                            a += (arr[(n-1)])%M;
                        else
                            a += (arr[(int) (R-1)])%M;
                    }
                    else if(R>L){
                        if(L>1)
                            a += (pref_arr.get((int) (R-1)) - pref_arr.get((int) (L-2)))%M;
                        else if(L==1)
                            a += (pref_arr.get((int) (R-1)))%M;
                        else if(L==0)
                            a += (arr[n-1] + (pref_arr.get((int) (R-1))))%M;
                    }
                    else {
                        a += (pref_arr.get(n-1) - pref_arr.get((int) (L-2)))%M;
                        if (R != 0) {
                            a += (pref_arr.get((int) (R - 1))) % M;
                        }
                    }
                }

            }
            ans.add((int) a);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {98,7,985,65,5};
        int n = 5;
        List<List<Long>> queries = new ArrayList<>();
        List<Long> qs = new ArrayList<>();
        qs.add(1L);
        qs.add(33L);

        queries.add(qs);
        int q = 1;
        List<Integer> ans1,ans2;
        ans1 = sumInRanges(arr,n,queries,q);
        ans2 = sumInRanges2(arr,n,queries,q);

        for (int i = 0; i < q; i++) {
            System.out.println("\nans="+ans1.get(i));
        }
        for (int i = 0; i < q; i++) {
            System.out.println("\nans="+ans2.get(i));
        }
    }
}
