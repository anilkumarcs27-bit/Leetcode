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
    public ListNode sortList(ListNode head) {
        if(head==null|| head.next==null) return head;
        ListNode slow  = head, fast = head.next;
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast = fast.next.next;
        }
        ListNode right = slow.next;
        slow.next =null;
        ListNode left = sortList(head);
        right = sortList(right);
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        while(left!=null && right!=null){
            if(left.val>right.val){
                curr.next = right;
                right = right.next;
            }else{
                curr.next = left;
                left = left.next;
            }
            curr= curr.next;
        }
        if(left!=null){
            curr.next = left;
        }else{
            curr.next = right;
        }

        return ans.next;
        
    }
}