class Solution {
    public int findPeakElement(int[] arr) {
        
        int s=0;
        int e=arr.length-1;
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid + 1 < arr.length && arr[mid]<arr[mid+1]){
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