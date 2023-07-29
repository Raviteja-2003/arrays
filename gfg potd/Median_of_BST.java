class Tree
{
    public static float findMedian(Node root)
    {
        List<Integer> ar=new ArrayList<>();
        inorder(ar,root);
        int n=ar.size();
        if(n%2!=0){
            return ar.get((n+1)/2-1);
        }else{
            int mid1=ar.get(n/2-1);
            int mid2=ar.get(n/2);
            return ((float)(mid1+mid2)/2);
        }
    }
    static void inorder(List<Integer>ar,Node root){
        if(root==null){
            return;
        }
        inorder(ar,root.left);
        ar.add(root.data);
        inorder(ar,root.right);
    }
}