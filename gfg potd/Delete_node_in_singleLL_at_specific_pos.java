class GfG
{
    Node deleteNode(Node head, int x)
    {
	    if(head==null || head.next==null) return null;
	    if(x==1) return head.next;
	    int count=1;
	    Node temp=head;
	    while(temp.next!=null){
	        if(count==x-1){
	            temp.next=temp.next.next;
	            break;
	        }
	       temp=temp.next;
	        count++;
	    }
	    return head;
    }
}