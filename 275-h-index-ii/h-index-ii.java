class Solution {
    // similar to EKO Spoj bas isme is valid ans me hame bache hue part ko nahi dkehna hai , hame dekhna hai ki kitne papers me kam se kam h citation hai
    public boolean isValidAns(int arr[],int h ){
       int count = 0; // Counts how many papers have at least 'h' citations
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= h) {
                count++;
            }
        }
        
        if (count >= h) return true;
        return false;
    }
    public int hIndex(int[] citations) {
        int s=0;
        int n=citations.length;
        int max=-1;
        for(int i=0;i<n;i++){
            if(citations[i]>max){
                max=citations[i];
            }
        }
        int ans=-1;
        int e=max;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValidAns(citations,mid)){
                ans=mid;
                s=mid+1;
            }
            else e=mid-1;
        }
        return ans;
    }
}