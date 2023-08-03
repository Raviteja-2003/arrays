class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
       if(!s.isEmpty()){
           int temp=s.pop();
           reverse(s);
           insertAtBottom(s,temp);
       }
       else{
           return;
       }
    }
    static void insertAtBottom(Stack<Integer> stack,int data){
        if(stack.isEmpty()){
            stack.push(data);
        }
        else{
            int temp=stack.pop();
            insertAtBottom(stack,data);
            stack.push(temp);
        }
    }
}