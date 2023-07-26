class Solution
{
    int num_node=0;
    void fill_parent(Node root,int parent[]){
        Queue<Node> q=new LinkedList<>();
        parent[root.data]=-1;
        q.offer(root);
        while(!q.isEmpty()){
                Node val=q.poll();
                if(val.left!=null) 
                {
                       q.offer(val.left);
                       parent[val.left.data]=val.data;
                }           
                if(val.right!=null)
                {
                    q.offer(val.right);
                    parent[val.right.data]=val.data;
                }
        }
    }        
    void length(Node root){
            if(root==null) return;
            length(root.right);
            num_node++;
            length(root.left);
    }
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        length(root);
        int parent[]=new int[num_node+1];
        fill_parent(root,parent);
        int cnt=0;
        while(node!=-1){
            node=parent[node];
            cnt++;
            if(cnt==k) return node;
        }
        return -1;
    }
}