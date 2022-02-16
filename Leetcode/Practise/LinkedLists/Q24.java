package Practise.LinkedLists;
//24. Swap Nodes in Pairs
public class Q24 {
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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode lstprev = null;
        head = head.next;

        while(curr != null){
            prev.next = curr.next;
            curr.next = prev;
            if(lstprev == null)
                lstprev = prev;
            else{
                lstprev.next = curr;
                lstprev = prev;
            }
            prev = prev.next;
            if(prev == null) break;
            curr = prev.next;
        }

        return head;

    }
}
