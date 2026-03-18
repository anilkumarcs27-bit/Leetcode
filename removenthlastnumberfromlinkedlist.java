
// nth from last = totalNode - n from first
public class removeNthNodeFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currNode = head;
        int count=0;
        while(currNode !=null){
            count++;
            currNode = currNode.next;
        }
        if(n==count) return head.next;
        int fromFirst  = count-n;
        currNode = head;
       for(int i=1; i<fromFirst;i++){
        currNode = currNode.next;
       }

        currNode.next = currNode.next.next;
        return head;

    }
}
