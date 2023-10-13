import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.AbstractMap;
class MinStack {
   
   Stack<Map.Entry<Integer, Integer>> stack;
    public MinStack() {
       
        stack = new Stack<>();
    }
    
    public void push(int val) {
        int prev = stack.isEmpty() ? val : stack.peek().getValue();
        int min = Math.min(val, prev);
        stack.push(new AbstractMap.SimpleEntry<>(val, min));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().getKey();
    }
    
    public int getMin() {
        return stack.peek().getValue();
    }
}
