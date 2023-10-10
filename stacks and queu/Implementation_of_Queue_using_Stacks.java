class MyQueue {
      Deque<Integer> s1 = new ArrayDeque<>();
      Deque<Integer> s2 = new ArrayDeque<>();
    public MyQueue() {
         s1 = new ArrayDeque<>();
         s2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        if(s1.isEmpty()){
            s1.add(x);
        }
        else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(x);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
    }
    
    public int pop() {
        if(s1.isEmpty()){
            return -1;
        }
        int temp=s1.pop();
        return temp;
    }
    
    public int peek() {
        if(s1.isEmpty()) return -1;
        return s1.peek();
    }
    
    public boolean empty() {
        if(s1.isEmpty()) return true;
        return false;
    }
}