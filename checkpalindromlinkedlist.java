 // leetcode question 234
 //https://leetcode.com/problems/palindrome-linked-list/description/
 

 // By using StringBuffer

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public boolean isPalindrome(ListNode head) {

        ListNode currNode = head;
        StringBuffer data = new StringBuffer("");
        while(currNode != null){
            data.append(currNode.val);
            currNode = currNode.next;
            
        }

        int left = 0;
        int right = data.length()-1;
        while(left<right){
            if(data.charAt(left)!=data.charAt(right))
                return false;
            
            left++;
            right--;
        }
        return true;
    }

    // By using arrayList

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr !=null){
            list.add(curr.val);
            curr = curr.next;
        }

        int start = 0;
        int end = list.size()-1;

        while(start < end){
            if(list.get(start) != list.get(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }


    // By using stack

    public boolean isPalindrome(ListNode head) {
        Stack<Integer>s = new Stack<>();
        ListNode curr = head;

        while(curr!=null){
            s.push(curr.val);
            curr = curr.next;
        }

        curr = head;

        while(curr != null){
            if(curr.val != s.pop()) return false;

            curr =  curr.next;
        }
        
        return true;
    }


    // By reversing the second half 

    public boolean isPalindrome(ListNode head) {
        if(head == null && head.next == null) return true;

        //Find middle;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
                   
                   slow = slow.next;
                   fast = fast.next.next;
        }

        //Reverse a list from middle

        ListNode prev = null;
        ListNode curr = slow;

        while(curr != null){

            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        //compare both the end;

        ListNode secondHalf = prev;
        ListNode firstHalf = head;

        while(secondHalf != null){

            if(secondHalf.val != firstHalf.val) return false;

            secondHalf = secondHalf.next;
            firstHalf = firstHalf.next;
        }

        return true;
    }
