class Solution
{
    public static Node reverse(Node head){
        Node cur=head;
        Node prev=null;
        Node nex=null;
        while(cur!=null){
            nex=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nex;
        }
        return prev;
    }
    public static void rearrange(Node odd)
    {
       if(odd.next==null) return;
       Node temp1=odd;
       Node temp2=odd.next;
       Node h1=temp1;
       Node h2=temp2;
       while(h1.next!=null && h2.next!=null){
           h1.next=h2.next;
           h1=h2.next;
           h2.next=h1.next;
           h2=h2.next;
       }
       h1.next=reverse(temp2);
    }
}
