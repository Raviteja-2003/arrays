class Solution {
    Node sortedInsert(Node head1, int key) {
        if(head1.data>key){
            Node temp=new Node(key);
            temp.next=head1;
            return temp;
        }
        Node temp=head1.next;
        Node prev=head1;
        boolean flag=true;
        while(temp!=null){
            if(temp.data>key){
                Node temp2=new Node(key);
                temp2.next=temp;
                prev.next=temp2;
                flag=false;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        if(flag){
            Node temp2=new Node(key);
            prev.next=temp2;
        }
        return head1;
    }
}