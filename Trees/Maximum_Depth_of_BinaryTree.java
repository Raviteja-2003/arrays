//level order traversal approach
class Solution {
    public int maxDepth(TreeNode root) {
        ArrayDeque<TreeNode> q=new ArrayDeque<>();
        int depth=0;
        if(root==null) return 0;
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            boolean temp=true;
            for(int i=0;i<s;i++){
                TreeNode node=q.peek();
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
                q.poll();
                if(temp){
                    depth++;
                    temp=false;
                }
            }
        }
        return depth;
    }
}
//recursive approach
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return 1+Math.max(l,r);
    }
}