class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
        int mid=(int)Math.ceil((sizeOfStack+1)/2.0);
        for(int i=0;i<mid-1;i++){
            int top=s.pop();
            ar.add(top);
        }
        s.pop();
        for(int i=ar.size()-1;i>=0;i--){
            s.push(ar.get(i));
        }
    } 
}
