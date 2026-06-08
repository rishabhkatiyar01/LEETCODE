class Solution {
    private int pivotIndex(int nums[]){
        int n=nums.length;

        if(nums[0]<nums[n-1]){
            return -1;
        }
        int s=0;
        int e=n-1;
        int ans=-1;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(nums[mid]<=nums[n-1]){
                e=mid-1;
            }
            else {
                ans=mid;
                s=mid+1;
            }

        }
        return ans;
    }
    public int binarysearch(int nums[],int start, int end, int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target)start=mid+1;
            else end=mid-1;
        }
        return -1;


    }
    public int search(int[] nums, int target) {
        int pivotindex=pivotIndex(nums);
        int n=nums.length;
        int a=-1;
        if(pivotindex==-1){
            int ans=binarysearch(nums,0,n-1,target);
            return  ans;
        }
        else {
        int startArray1=0;
        int endArray1=pivotindex;
        if(target>=nums[startArray1] && target<=nums[endArray1]){
            a= binarysearch(nums, startArray1,endArray1,target);
        }
        int startArray2=pivotindex+1;
        int endArray2=n-1;
         if(target>=nums[startArray2] && target<=nums[endArray2]){
            a= binarysearch(nums, startArray2,endArray2,target);
        }

        }
        
        return a ;
    }
}