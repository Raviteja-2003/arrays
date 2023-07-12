public class Solution
{
    public static Node constructDLL(int []arr) {
        // Write your code here
        Node head=new Node(arr[0]);
        head.prev=null;
        Node temp=head;
        for(int i=1;i<arr.length;i++){
           Node curNode=new Node(arr[i]);
           temp.next=curNode;
           curNode.prev=temp;
           temp=temp.next;
        }
        temp.next=null;
        return head;
    }
}