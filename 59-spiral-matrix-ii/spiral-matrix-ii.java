class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int [n][n];
        int srow=0;
        int erow=n-1;
        int scol=0;
        int ecol=n-1;
        int x=1;
        while(srow<=erow && scol<=ecol){
            for(int i=scol;i<=ecol;i++){
                matrix[srow][i]=x++;
           
            }
            srow++;
            for(int i=srow;i<=erow;i++){
                matrix[i][ecol]=x++;  
            }
            ecol--;
            if(srow<=erow){
            for(int i=ecol;i>=scol;i--){
               matrix[erow][i]=x++;
               
            }

            erow--;
            }
            if(scol<=ecol)
            {
            for(int i=erow;i>=srow;i--){
                matrix[i][scol]=x++;
            }
            scol++;
            }
        }
        return matrix;
    }
}