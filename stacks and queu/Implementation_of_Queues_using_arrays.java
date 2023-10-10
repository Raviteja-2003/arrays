public class Solution {
    class Queue {
        int front, rear;
        int []arr;
        int count;
        Queue() {
            front = 0;
            rear = 0;
            count=0;
            arr = new int[100001];
        }

        // Enqueue (add) element 'e' at the end of the queue.
        public void enqueue(int e) {
            if(count==1000001){
                return ;
            }
            arr[rear%100001]=e;
            rear++;
            count++;
        }

        // Dequeue (retrieve) the element from the front of the queue.
        public int dequeue() {
            if(count==0){
                return -1;
            }
            int temp=arr[front%100001];
            front++;
            count--;
            return temp;
        }
    }
}