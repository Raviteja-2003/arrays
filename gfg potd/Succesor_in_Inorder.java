class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
           Node successor=null;
           while(root!=null){
               if(x.data<root.data){
                   successor=root;
                   root=root.left;
               }
               else{
                   root=root.right;
               }
           }
           return successor;
         }
}