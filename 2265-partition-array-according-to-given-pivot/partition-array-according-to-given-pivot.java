class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> arr3=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                arr1.add(nums[i]);
            }
            else if(nums[i]==pivot){
                arr2.add(nums[i]);
            }
            else arr3.add(nums[i]);
        }
        int k=0;
        for(int i=0;i<arr1.size();i++){
            nums[k++]=arr1.get(i);
        }
        for(int i=0;i<arr2.size();i++){
            nums[k++]=arr2.get(i);
        }
        for(int i=0;i<arr3.size();i++){
            nums[k++]=arr3.get(i);
        }
        return nums;
    }
}