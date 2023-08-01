
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ar=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[V];
        q.offer(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int ele=q.poll();
            ar.add(ele);
            for(int neigh:adj.get(ele)){
                if(!vis[neigh]){
                    vis[neigh]=true;
                    q.offer(neigh);
                }
            }
        }
        return ar;
    }
}