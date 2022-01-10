package Contests.weekly274;
//2127. Maximum Employees to Be Invited to a Meeting
//not done
import java.util.*;
public class Q2127 {
    public static int maximumInvitations(int[] favorite) {
        int[] participants = new int[favorite.length];
        Arrays.fill(participants,0);
        int maxInvites = favorite.length;
        for (int i = 0; i < favorite.length; i++) {
            if(i != favorite[favorite[i]])
                participants[favorite[i]]++;
        }

        for (int participant : participants) {
            if (participant > 1)
                maxInvites--;
        }

        return maxInvites;
    }

    public static void main(String[] args) {
        int[] favourite = {2,2,1,2};//-3 //1,2,0 - 3 //3,0,1,4,1 - 4
        int[] favourite2 = {1,2,0};
        int[] favourite3 = {3,0,1,4,1};
        int[] favourite4 = {1,0,0,2,1,4,7,8,9,6,7,10,8};//6
        int ans = maximumInvitations(favourite4);
        System.out.println(ans);
    }
}
