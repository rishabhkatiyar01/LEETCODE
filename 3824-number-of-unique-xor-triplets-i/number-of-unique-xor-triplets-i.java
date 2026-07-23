class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<=2)return n;
        int x=1;
        for(int i:nums){
            x|=i;
        }
        return x+1;
        
    }
}