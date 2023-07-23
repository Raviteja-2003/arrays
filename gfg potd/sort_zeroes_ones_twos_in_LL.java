class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        int count1=0;
        int count2=0;
        int count0=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                count0++;
            }
            else if(temp.data==1){
                count1++;
            }else{
                count2++;
            }
            temp=temp.next;
        }
        int count=count0+count1+count2;
        Node dummy=new Node(0);
        Node cur=dummy;
        for(int i=0;i<count;i++){
            if(count0!=0){
                cur.next=new Node(0);
                cur=cur.next;
                count0--;
            }
            else if(count1!=0){
                cur.next=new Node(1);
                cur=cur.next;
                count1--;
            }
            else{
                cur.next=new Node(2);
                cur=cur.next;
                count2--;
            }
        }
        return dummy.next;
    }
}
