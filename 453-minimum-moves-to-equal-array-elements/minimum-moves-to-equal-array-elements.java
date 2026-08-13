class Solution {
    public int minMoves(int[] nums) {
        int mini=nums[0];

        for(int i=1;i<nums.length;i++){
            mini=Math.min(nums[i],mini);

        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
                sum+=nums[i];
        }

        return sum-(mini*nums.length);
        
    }
}