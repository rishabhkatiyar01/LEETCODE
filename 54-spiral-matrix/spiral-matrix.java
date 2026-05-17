class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer>arr=new ArrayList<>();
        int srow=0;
        int erow=m-1;
        int scol=0;
        int ecol=n-1;
        while(srow<=erow && scol<=ecol){
            for(int i=scol;i<=ecol;i++){
                arr.add(matrix[srow][i]);
           
            }
            srow++;
            for(int i=srow;i<=erow;i++){
                arr.add(matrix[i][ecol]);  
            }
            ecol--;
            if(srow<=erow){
            for(int i=ecol;i>=scol;i--){
                arr.add(matrix[erow][i]);
               
            }

            erow--;
            }
            if(scol<=ecol)
            {
            for(int i=erow;i>=srow;i--){
                arr.add(matrix[i][scol]);
            }
            scol++;
            }
        }
        return arr;
    }
}