class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ar=new ArrayList<>();
        boolean vis[]=new boolean[V];
        vis[0]=true;
        dfs(0,vis,adj,ar);
        return ar;
    }
    public void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ar){
        vis[node]=true;
        ar.add(node);
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfs(it,vis,adj,ar);
            }
        }
    }
}