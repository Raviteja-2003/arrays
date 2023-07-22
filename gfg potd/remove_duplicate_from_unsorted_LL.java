class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         if(head==null || head.next==null){
             return head;
         }
         HashSet<Integer> hs=new HashSet<>();
         Node dummy=new Node(0);
         dummy.next=head;
         Node cur=dummy.next;
         Node nex=cur.next;
         hs.add(cur.data);
         while(nex!=null){
             if(hs.contains(nex.data)){
                 cur.next=nex.next;
                 nex=cur.next;
             }else{
                 hs.add(nex.data);
                 cur=cur.next;
                 nex=cur.next;
             }
         }
         return dummy.next;
    }
}