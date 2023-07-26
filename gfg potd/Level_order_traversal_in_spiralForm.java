class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
         ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        Queue<Node> q = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        boolean leftToRight = false; // To indicate the current direction of traversal

        q.offer(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node current = q.poll();

                if (leftToRight) {
                    res.add(current.data);
                } else {
                    stack.push(current.data);
                }

                // Add the left and right child of the current node to the queue
                if (current.left != null)
                    q.offer(current.left);
                if (current.right != null)
                    q.offer(current.right);
            }

            // For odd levels, print the nodes from the stack
            while (!stack.isEmpty()) {
                res.add(stack.pop());
            }

            // Toggle the direction for the next level
            leftToRight = !leftToRight;
        }

        return res;
    }
}