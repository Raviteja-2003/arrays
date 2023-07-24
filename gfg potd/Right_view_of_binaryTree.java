class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node curNode = q.poll();
                if (curNode.left != null) q.offer(curNode.left);
                if (curNode.right != null) q.offer(curNode.right);
                if (i == size-1) ans.add(curNode.data);
            }
        }
        return ans;
    }
}