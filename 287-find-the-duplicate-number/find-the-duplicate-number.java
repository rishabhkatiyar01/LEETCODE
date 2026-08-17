class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            if(set.contains(ele)){
                return ele;
            }
            set.add(ele);
        }
        return -1;
    }
}