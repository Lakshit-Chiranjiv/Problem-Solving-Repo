package Practise.graphs;
//127. Word Ladder
import java.util.*;
public class Q127 {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> s = new HashSet<>();
        int ansPresent=0;
        for(String wrd:wordList){
            if(wrd.equals(endWord))
                ansPresent=1;
            s.add(wrd);
        }

        if(ansPresent==0) return 0;

        int dep=0,qs=0;
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);

        while(q.size() != 0){
            dep++;
            qs=q.size();
            while(qs != 0){
                String c = q.peek();
                String z = q.remove();

                for(int i=0;i<c.length();i++){
                    String tp = c;
                    for(char j='a';j<='z';j++){
                        char[] arr = tp.toCharArray();
                        arr[i] = (char)j;
                        tp = String.valueOf(arr);

                        if(c.equals(tp))
                            continue;
                        if(tp.equals(endWord))
                            return dep+1;
                        if(s.contains(tp)){
                            q.add(tp);
                            s.remove(tp);
                        }
                    }
                }
                qs--;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String start = "hit";
        String end = "cog";
        List<String> wrdlst = new ArrayList<>();
        wrdlst.add("hot");
        wrdlst.add("dot");
        wrdlst.add("dog");
        wrdlst.add("lot");
        wrdlst.add("log");
        wrdlst.add("cog");
        int ans = ladderLength(start,end,wrdlst);
        System.out.println(ans);
    }
}
