public class DeleteMiddleOfTheLinkedList {
     public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next ==null) return null;
        ListNode pre = new ListNode();
        pre.next = head;
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            pre = pre.next;
        }

        pre.next = pre.next.next;
        return head;
    }
}
