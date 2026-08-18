/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;khb
 *     ListNode() {}hg
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode cur = head;
        
        int size=0;
        // ListNode cur = head;
        
            while(cur!= null){
                cur= cur.next;
                size++;
            }
        if (n==size){
            return head.next;
        }
        cur= head;
        for(int i=1;i<size-n;i++){
            cur= cur.next;
        }
        cur.next = cur.next.next;
    return head;        
}
}