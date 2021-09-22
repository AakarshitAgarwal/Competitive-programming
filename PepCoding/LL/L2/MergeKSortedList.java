class Solution
{
    //Function to merge K sorted linked list.
    
    
    // public static Node SortedMerge(Node a, Node b)
    // {
    //     Node result = null;
    //     /* Base cases */
    //     if (a == null)
    //         return b;
    //     else if (b == null)
    //         return a;
 
    //     /* Pick either a or b, and recur */
    //     if (a.data <= b.data) {
    //         result = a;
    //         result.next = SortedMerge(a.next, b);
    //     }
    //     else {
    //         result = b;
    //         result.next = SortedMerge(a, b.next);
    //     }
 
    //     return result;
    // }
    
    static Node SortedMerge(Node a, Node b)
    {
    if(a==null || b==null){
        return a!=null?a:b;
    }
    
    Node dummyNode=new Node(-1);
    Node prev=dummyNode;
    Node c1=a,c2=b;
    
    while(c1!=null && c2!=null){
    if(c1.data<c2.data){
        prev.next=c1;
        c1=c1.next;
    }else{
        prev.next=c2;
        c2=c2.next;
    }
    prev=prev.next;
    }
    
    prev.next=c1!=null?c1:c2;
    return dummyNode.next;
    }
    
    static Node mergeKlist(Node[] list,int si,int ei){
        if(si>ei) return null;
        if(si==ei) return list[si];
        int mid=(si+ei)/2;
        
        Node l1=mergeKlist(list,si,mid);
        Node l2=mergeKlist(list,mid+1,ei);
        
        return SortedMerge(l1,l2);
    }
    
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        
        // while(K!=0){
        //     int i=0,j=K-1;
            
        //     while(i<j){
                
        //         arr[i]=SortedMerge(arr[i],arr[j]);
                
        //         i++;
        //         j--;
                
        //         if(i>=j){
        //             K=j;
        //         }
        //     }
        // }
        // return arr[0];
        if(arr.length==0){
            return null;
        }
        return mergeKlist(arr,0,K-1);
    }
}



//2nd solution

class Solution
{
    //Function to merge K sorted linked list.
    
    
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->{
            return a.data-b.data;
        });
        
        for(Node l:arr){
            if(l!=null){
                pq.add(l);
            }
        }
        
        Node dummy=new Node(-1);
        Node prev=dummy;
        while(pq.size()!=0){
            Node node=pq.remove();
            
            prev.next=node;
            prev=prev.next;
            node=node.next;
            
            if(node!=null)pq.add(node);
        }
        return dummy.next;
    }
}
