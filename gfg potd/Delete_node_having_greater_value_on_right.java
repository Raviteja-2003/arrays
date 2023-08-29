class Solution
{
    Node reverse(Node head){
        Node prev=null;
        Node next=null;
        Node temp=head;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    Node compute(Node head)
    {
        Node rev=reverse(head);
        int maxi=0;
        Node prev=null;
        Node temp=rev;
        while(temp!=null){
            if(temp.data>=maxi){
                 maxi=temp.data;
                 prev=temp;
                 temp=temp.next;
            }
            else{
                prev.next=temp.next;
                temp=prev;
            }
        }
        return reverse(rev);
    }
}