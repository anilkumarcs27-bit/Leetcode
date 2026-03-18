// less optimized 
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode addHead = new ListNode();
        ListNode addCurr = addHead;
        int carry = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            addCurr.val = sum%10;
            carry = sum/10;
            
            l1 = l1.next;
            l2 = l2.next;

            if(l1!= null || l2 != null){
                addCurr.next = new ListNode();
                addCurr = addCurr.next;
            }
        }

        while(l1 != null){
            int sum = l1.val+ carry;
            addCurr.val = sum%10;
            carry = sum/10;
            l1 = l1.next;
           if(l1 != null){
             addCurr.next = new ListNode();
            addCurr = addCurr.next;
           }
        }

        while(l2 != null){
            int sum = l2.val+ carry;
            System.out.println(sum);
            addCurr.val = sum%10;
            carry = sum/10;
            l2 = l2.next;

            if(l2 !=null){
                addCurr.next = new ListNode();
                addCurr = addCurr.next;
            }
        }

        if(carry != 0){
            addCurr.next = new ListNode();
            addCurr = addCurr.next;
            addCurr.val = carry;
        }
        

        return addHead;
    }

// most optimized
 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode addHead = new ListNode();
        ListNode addCurr = addHead;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            // int sum = l1.val + l2.val + carry;
            int sum = (l1 != null ? l1.val:0) +( l2 != null ? l2.val:0) + carry; 
            
            addCurr.next = new ListNode(sum%10);
            carry = sum/10;
            addCurr = addCurr.next;


            if(l1!= null){
               l1 = l1.next;
            }

            if(l2 != null){
                l2 = l2.next;
            }
        }

        
        return addHead.next;
    }
