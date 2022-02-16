package Practise.LinkedLists;
//1721. Swapping Nodes in a Linked List
public class Q1721 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public ListNode swapNodes(ListNode head, int k) {
        ListNode tmp = head;
        ListNode p = head;
        ListNode q = head;
        int n=0;
        while(tmp != null){
            n++;
            tmp = tmp.next;
        }
        int a = k;
        while(a > 1){
            p = p.next;
            a--;
        }

        int b = n - k + 1;
        while(b > 1){
            q = q.next;
            b--;
        }

        int t = p.val;
        p.val = q.val;
        q.val = t;

        return head;
    }
}
