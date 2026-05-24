class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length-1;
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]<arr[mid+1]){
                //left wali side hai and right wli siide me ans ho skta hai
                s=mid+1;
            }
            else{
                ans=mid;
                e=mid-1;
            }
        }
        return ans;
    }
}