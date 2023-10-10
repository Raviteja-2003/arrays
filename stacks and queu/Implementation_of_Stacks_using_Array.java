public class Solution{
    static class Stack {
        int stackk[];
        int top;
        int capacity;
        Stack(int capacity) {
            this.capacity=capacity;
            stackk=new int[capacity];
            top=-1;
        }
        public void push(int num) {
            if(top==capacity-1){ return;}
            else{
                top++;
                stackk[top]=num;
            }
        }
        public int pop() {
            if(isEmpty()==1){
                return -1;
            }
            int temp=stackk[top];
            top--;
            return temp;
        }
        public int top() {
            if(isEmpty()==1){
                return -1;
            }
            return stackk[top];
        }
        public int isEmpty() {
            if(top==-1){
                return 1;
            }
            return 0;
        }
        public int isFull() {
            if(top==capacity-1){
                return 1;
            }
            return 0;
        }
    }
}