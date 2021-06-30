class Result {

    /*
     * Complete the 'removeDuplicates' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

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