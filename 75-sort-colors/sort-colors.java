class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        
        int a=0,b=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)a++;
            else if(nums[i]==1)b++;
            else c++;
        }
int idx=-1;
    for(int j=0;j<a;j++){
        nums[j]=0;
        idx++;
    }
    for(int j=idx+1;j<a+b;j++){
        nums[j]=1;
        idx++;
    }
    for(int j=idx+1;j<a+b+c;j++){
        nums[j]=2;
        idx++;
    }
 
    }
}