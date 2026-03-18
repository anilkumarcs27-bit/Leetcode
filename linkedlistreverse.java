// Question 206 
// reverse linkedlist
// https://leetcode.com/problems/reverse-linked-list/description/

// using iterative approach
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode preNode = head;
        ListNode currNode = head.next;
        preNode.next = null;
        while( currNode != null){
            ListNode nextNode = currNode.next;

            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        return preNode;
    }
}


// using recursive approach 

public ListNode reverseList(ListNode head) {
        if(head ==null || head.next ==null) return head;
        // ListNode prevNode = null;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }
