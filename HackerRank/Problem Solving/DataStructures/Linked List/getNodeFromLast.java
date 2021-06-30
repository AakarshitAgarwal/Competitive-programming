    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
    // Write your code here
    SinglyLinkedListNode result=llist;
    
    int count=0;
    while(llist!=null){
        llist=llist.next;
        count++;
    }
    int positionFromHead=(count-positionFromTail);
    for(int i=0;i<positionFromHead-1;i++){
        result=result.next;
    }
    return result.data;

    }