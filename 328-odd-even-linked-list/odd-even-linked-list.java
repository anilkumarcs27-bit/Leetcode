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
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next== null|| head.next.next == null) return head;
        ListNode odd = head, even = head.next, h1 = head, h2 = head.next;
        while(h2!=null && h2.next!=null){
            h1.next= h1.next.next;
            h2.next = h2.next.next;
            h1 = h1.next;
            h2 = h2.next;
        }

        h1.next = even;
        return odd;
    }
}