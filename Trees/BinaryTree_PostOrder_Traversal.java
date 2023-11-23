//recursive approach
class Solution {
    public static void postorder(TreeNode root,List<Integer> res){
        if(root==null) return;
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        postorder(root,res);
        return res;
    }
}
//iterative approach using 2 stacks
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        if(root==null) return res;
        st1.push(root);
        while(!st1.isEmpty()){
            TreeNode node=st1.pop();
            st2.push(node);
            if(node.left!=null) st1.push(node.left);
            if(node.right!=null) st1.push(node.right);
        }
        while(!st2.isEmpty()){
            res.add(st2.pop().val);
        }
        return res;
    }
}
//iterative approach using 1 stack
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null) return res;
        TreeNode cur=root;
        TreeNode temp=null;
        while(cur!=null || !st.isEmpty()){
            if(cur!=null){
                st.push(cur);
                cur=cur.left;
            }
            else{
                 temp=st.peek().right;
                if(temp==null){
                     temp=st.peek();
                     st.pop();
                     res.add(temp.val);
                     while(!st.isEmpty() && temp==st.peek().right){
                         temp=st.peek();
                         st.pop();
                         res.add(temp.val);
                     }
                }
                else{
                    cur=temp;
                }
            }
        }
        return res;
    }
}