class Solution {
    public int findMin(int[] nums) {

        int min=nums[0];

        for(int a:nums){
            if(a<min){
                min=a;
            }
        }
        return min;
        
    }
}