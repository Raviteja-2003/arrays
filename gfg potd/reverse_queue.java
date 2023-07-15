class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> st=new Stack<>();
        int len=q.size();
        for(int i=0;i<len;i++){
            int x=q.remove();
            st.add(x);
        }
        for(int i=0;i<len;i++){
            int x=st.pop();
            q.add(x);
        }
        return q;
        
    }
}