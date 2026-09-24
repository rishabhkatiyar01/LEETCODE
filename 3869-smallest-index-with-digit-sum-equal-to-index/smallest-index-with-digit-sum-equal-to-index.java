class Solution {
    public int digSum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int n=nums.length;

        for(int i=0;i<n;i++){
            int dig=digSum(nums[i]);
            if(i==dig){
                return i;
            }
        }
        return -1;
    }
}