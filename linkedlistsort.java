public ListNode sortList(ListNode head) {
        if(head==null || head.next ==null) return head;

        ListNode middle = getMiddleNode(head);
        ListNode secondHead = middle.next;
        middle.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(secondHead);

        return merge(left, right); 

    }

    public static ListNode getMiddleNode(ListNode head){
        if(head==null) return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode merge(ListNode left, ListNode right){
        if(left==null) return right;
        if(right == null) return left;

        ListNode curr;

        if(left.val <= right.val){
            curr = left;
            left = left.next;
            curr.next = merge(left, right);
        }else{
            curr = right;
            right = right.next;
            curr.next = merge(left, right);
        }
        return curr;
    }


    // merge  using iterative approach for more optimization 

    public ListNode sortList(ListNode head) {
        if(head==null || head.next ==null) return head;

        ListNode middle = getMiddleNode(head);
        ListNode secondHead = middle.next;
        middle.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(secondHead);

        return merge(left, right); 

    }

    public static ListNode getMiddleNode(ListNode head){
        if(head==null) return head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next !=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode merge(ListNode left, ListNode right){
        ListNode mergeHead = new ListNode();
        ListNode curr = mergeHead;

        while(left!= null && right != null){
            if(left.val <= right.val){
                curr.next = left;
                left = left.next;
            }else{
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }

        if(left != null){
            curr.next = left;
        }else{
            curr.next = right;
        }
        return mergeHead.next;
    }
