class Solution {
    public long maxAlternatingSum(int[] nums) {

        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        Arrays.sort(nums);
        long sum=0;

        int start=0;
        int end=nums.length-1;
    
        while(start<end){
            sum+=nums[end];
            sum-=nums[start];
            start++;
            end--;
        }

if(start==end){
    sum+=nums[start];
}
        return sum;
        
    }
}