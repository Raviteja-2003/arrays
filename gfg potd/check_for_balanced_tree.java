class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	     return checkbalance(root)!=-1;
    }
    int checkbalance(Node root){
        if(root==null){
            return 0;
        }
        int leftt=checkbalance(root.left);
        if(leftt==-1){
            return -1;
        }
        int rightt=checkbalance(root.right);
        if(rightt==-1){
            return -1;
        }
        int temp=Math.abs(leftt-rightt);
        if(temp>1){
            return -1;
        }
        else{
            return Math.max(leftt,rightt)+1;
        }
    }
}
