class Solution {
    public int f(int op, int l, int []nums, int []multipliers, int dp [][]){
        if(op==multipliers.length)return 0;
         if (dp[op][l] != 0) {
            return dp[op][l];
        }
        int left=nums[l]*multipliers[op]+f(op+1, l+1,  nums, multipliers,dp);
        int right=nums[(nums.length-1-(op-l))]*multipliers[op]+f(op+1, l, nums, multipliers, dp);

        return dp[op][l]=Math.max(left, right);

    }
    public int maximumScore(int[] nums, int[] multipliers) {
        int op=0;
        int l=0;
        int m=multipliers.length;
       int dp[][]=new int [m][m];
       
        return f(op, l,nums, multipliers, dp);

        
    }
}