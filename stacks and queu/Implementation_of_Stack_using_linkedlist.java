public class Solution {
    static class Stack {
        Node head;

        Stack()
        {
            head=new Node(-1);
        }

        int getSize()
        {
            int size=0;
            Node temp=head;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
            return size-1;
        }

        boolean isEmpty()
        {
            if(head.data==-1){
                return true;
            }
            return false;
        }

        void push(int data)
        {
            Node newnode=new Node(data);
            newnode.next=head;
            head=newnode;
        }

        void pop()
        {
            if(head.data!=-1){
                head=head.next;
            }
        }

        int getTop()
        {
        
             return head.data;
        }
    }
}