public class Solution extends Queue{
    Node front=new Node(-1);
    Node rear=new Node(-1);
    public void push(int x) {
        Node newnode=new Node(x);
        if(front==null || front.data==-1){
            front=newnode;
            rear=newnode;
        }
        else{
            rear.next=newnode;
            rear=rear.next;
        }
    }

    public int pop() {
        if(front==null || front.data==-1){
            return -1;
        }
        int val=front.data;
        front=front.next;
        return val;
    }
}