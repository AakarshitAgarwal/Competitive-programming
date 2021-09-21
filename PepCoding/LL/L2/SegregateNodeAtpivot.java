public static ListNode segregate(ListNode head, int pivotIdx) {
    // return null;
    
    if(head==null || head.next==null){
        return head;
    }
    
    int idx=0,data=0;
    
    ListNode current=head;
    while(current!=null){
        if(idx==pivotIdx){
            data=current.val;
        }
        current=current.next;
        idx++;
    }
    
    
    ListNode smaller =new ListNode(-1);
    ListNode sp=smaller;
    
    ListNode larger=new ListNode(-1);
    ListNode lp=larger;
    
    ListNode curr=head;
    idx=0;
    ListNode pivot=null;
    while(curr!=null){
        if(idx==pivotIdx){
            pivot=curr;
        }else if(curr.val<=data){
            sp.next=curr;
            sp=sp.next;
        }
        else{
            lp.next=curr;
            lp=lp.next;
        }
        curr=curr.next;
        idx++;
    }
    
    sp.next=pivot;
    pivot.next=larger.next;
    lp.next=null;
    
    
    
    return smaller.next;
  }
