package Contests.biweekly69;
//2030. Maximum Twin Sum of a Linked List

import java.util.*;
public class Q2130 {
    ListNode ln = new ListNode();
    public static int pairSum(ListNode head) {
        long maxTwinSum = 0,currentTwinSum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp;
        temp = head;
        while (temp.next != null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }
        arr.add(temp.val);
        int i = 0,j = arr.size()-1;
        while (i<j){
            currentTwinSum = arr.get(i) + arr.get(j);
            maxTwinSum = Math.max(maxTwinSum,currentTwinSum);
            i++;
            j--;
        }

        return (int) maxTwinSum;

    }

    public static void main(String[] args) {
        ListNode head;

    }

}
