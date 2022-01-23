package arrays;
import java.util.*;
public class XORquery {

//    TLE solution - correct but not accepted
    public static ArrayList<Integer> xorQuery(ArrayList<ArrayList<Integer>> queries) {

        // Write your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0;i<queries.size();i++){
            int a = queries.get(i).get(0);
            int b = queries.get(i).get(1);
            if(a==1)
                ans.add(b);
            else{
                for(int j=0;j<ans.size();j++){
                    ans.set(j,ans.get(j)^b);
                }
            }
        }
        return ans;
    }
}
