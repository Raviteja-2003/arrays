//recursive approach
class Solution {
    public void inorder(TreeNode root,List<Integer> res){
        if(root==null) return;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        return ans;
    }
}
//iterative approach
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        TreeNode node=root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty()) break;
                node=st.pop();
                ans.add(node.val);
                node=node.right;
            }
        }
        return ans;
    }
}