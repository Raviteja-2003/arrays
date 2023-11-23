class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayDeque<TreeNode> q=new ArrayDeque<>();
        if(root==null) return res;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            TreeNode temp=q.peek();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<n;i++){
                 if(temp.left!=null) q.offer(temp.left);
                 if(temp.right!=null) q.offer(temp.right);
                level.add(q.poll().val);
                temp=q.peek();
            }
            res.add(level);
        }
        return res;
    }
}