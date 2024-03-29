class Result {

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
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

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
    
    // llist.add(position-1,data);
    //     return llist;
    
    SinglyLinkedListNode node =new SinglyLinkedListNode(data);
    if(position==0){
        node.next=llist.next;
        llist=node;
    }else{
        SinglyLinkedListNode aux=new SinglyLinkedListNode(0);
        aux.next=llist;
        for(int i=0;i<position;i++){
            aux=aux.next;
        }
            node.next=aux.next;
            aux.next=node;
    }
    
    return llist;
    
    }

}
