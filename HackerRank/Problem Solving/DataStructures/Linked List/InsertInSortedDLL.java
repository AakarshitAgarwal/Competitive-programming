class Result {

    /*
     * Complete the 'sortedInsert' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_DOUBLY_LINKED_LIST llist
     *  2. INTEGER data
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
    // Write your code here
    
    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
    
    if (llist == null) { // insert in empty list
        return newNode;
    } else if (data < llist.data) { // insert in front of list
        newNode.next = llist;
        llist.prev = newNode; //making both connections
        return newNode;
    } else {        
        /* Walk list with 2 pointers (code is cleaner than using just 1 pointer) */
        DoublyLinkedListNode n1 = null;
        DoublyLinkedListNode n2 = llist;
        while (n2 != null && n2.data < data) {
            n1 = n2;
            n2 = n2.next;
        }
        
        if (n2 == null) { // insert at end of list
            n1.next = newNode;
            newNode.prev = n1;
        } else { // insert somewhere within the list
            n1.next = newNode;
            n2.prev = newNode;
            newNode.prev = n1;
            newNode.next = n2;
        }
        return llist;
    }
    }
}
