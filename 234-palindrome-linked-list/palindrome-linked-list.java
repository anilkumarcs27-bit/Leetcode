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
    public boolean isPalindrome(ListNode head) {
        if(head==null|| head.next==null) return true;
        ListNode fast =head;
        ListNode slow = head;
        Stack<Integer> s = new Stack<>();
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            s.push(slow.val);
            slow = slow.next;
        }
       
        if(fast==null){

        }else if(fast.next==null){
            
            s.push(slow.val);
        }
        while(slow!=null){
            
            if(slow.val!=s.pop()) return false;
            
            slow = slow.next;
        }
        if(s.isEmpty()){ return true;}

        return false;
    }
}