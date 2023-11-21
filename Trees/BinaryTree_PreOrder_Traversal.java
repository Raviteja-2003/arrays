//recursive approach
class Solution {
    public static void preorder(TreeNode root,List<Integer>res){
        if(root==null) return;
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nodes=new ArrayList<>();
        preorder(root,nodes);
        return nodes;
    }
}
//iterative approach
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        List<Integer> res=new ArrayList<>();
        st.push(root);
        if(root==null){
            return res;
        }
        while(!st.isEmpty()){
            int ele=st.peek().val;
            res.add(ele);
            TreeNode top=st.pop();
            if(top.right!=null){
                st.push(top.right);
            }
            if(top.left!=null){
                st.push(top.left);
            }
        }
        return res;
    }
}