class Result {

    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
    // Write your code here
    int count=0;
    
    SinglyLinkedListNode temp=llist;
    
    if(llist==null || llist.next==null){
        return llist;
    }
        
    while(temp.next!=null){
        if(temp.data==temp.next.data){
            temp.next=temp.next.next;
            continue;
        }
        temp=temp.next;
    }
    
    return llist;
    }

}