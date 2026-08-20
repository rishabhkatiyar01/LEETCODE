 class DSU{
        int [] parent;

        public DSU(int size){
            parent=new int[size];

            for(int i=0;i<size;i++){
                parent[i]=i;
            }
        }
        public int find(int node){
            if(parent[node]==node)return node;
            return find(parent[node]);
        }
        public boolean union(int u, int v){
           int p1 = find(u);
            int p2 = find(v);

            if (p1 == p2) {
                return false; // Already connected, cycle detected
            }

            parent[p2] = p1; // Link the roots
            return true;
        }

        
        public boolean isConnected(int u, int v){
            if(parent[u]==parent[v]) return true;
            return false;
        }
        

}
class Solution {

    public int[] findRedundantConnection(int[][] edges) {
        DSU dsu=new DSU(edges.length+1);

        for(int [] edge:edges){
            if(dsu.union(edge[0],edge[1] )==false){
                return edge;
            }
        }
        return new int[]{-1,-1};
    }
}