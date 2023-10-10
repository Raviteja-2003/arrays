class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList();
    }
    
    public void push(int x) {
        q.offer(x);
        for(int i=0;i<q.size()-1;i++){
            q.offer(q.peek());
            q.poll();
        }
    }
    
    public int pop() {
        int temp=q.poll();
        return temp;
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if(q.isEmpty()){
            return true;
        }
        return false;
    }
}