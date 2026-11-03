class DSU{
    private final int[] parent;
    private final int[] size;
      public   DSU(int n) {
        parent = new int[n];
        size = new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
      }
      public int find(int x){
        if(parent[x]==x)return x;
        else 
       return  parent[x]=find(parent[x]);
        
      }

      public boolean union(int u, int v){
        int Pu=find(u);
        int Pv=find(v);
        if(Pu==Pv) return false;
        if(size[Pu]<size[Pv]){
            parent[Pu]=Pv;
        size[Pv] += size[Pu];
        }
        else if(size[Pu]>size[Pv]){
             parent[Pv]=Pu;
              size[Pu] += size[Pv];
        }
        else {
            parent[Pv]=Pu;
            size[Pu]+=size[Pv];
            }
            return true;
      }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {

        if(connections.length<n-1)return -1;
        DSU dsu=new DSU(n);
        int components=n;
        for(int i=0;i<connections.length;i++){
            int u=connections[i][0];
            int v=connections[i][1];
            boolean isMerged=dsu.union(u,v);

            if(isMerged){
                components--;
            }
        }
        
        return components-1;
    }
}