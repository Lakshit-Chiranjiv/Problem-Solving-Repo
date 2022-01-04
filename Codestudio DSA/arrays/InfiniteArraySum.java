package arrays;
    //sum of infinite array
import java.util.*;
public class InfiniteArraySum {

    public static List<Integer> sumInRanges(int[] arr, int n, List<List<Long>> queries, int q) {

        // Write your code here!
        long M = 1000000007,L,R,a = 0;
        ArrayList<Long> pref_arr = new ArrayList<>();
        pref_arr.add((long) arr[0]);

        for (int i = 1; i < n; i++) {
            pref_arr.add((pref_arr.get(i-1) + arr[i])%M);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(pref_arr.get(i)+",");
        }

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
                        if(R==0){
                            a += (pref_arr.get(n-1) - pref_arr.get((int) (L-2)))%M;
                        }
                        else {
                            a += (pref_arr.get(n-1) - pref_arr.get((int) (L-2)))%M;
                            a += (pref_arr.get((int) (R-1)))%M;
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
        List<Integer> ans;
        ans = sumInRanges(arr,n,queries,q);

        for (int i = 0; i < q; i++) {
            System.out.println("\nans="+ans.get(i));
        }
    }
}
