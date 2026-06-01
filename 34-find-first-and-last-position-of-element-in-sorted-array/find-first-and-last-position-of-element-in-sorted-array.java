class Solution { 
    public int[] searchRange(int[] nums, int target) { 
        int n = nums.length; 
        int s = 0; 
        int e = n - 1; 
        int first = -1;
        int last = -1; 

        while (s <= e) { 
            int mid = s + (e - s) / 2; 
            if (nums[mid] >= target) { 
                if (nums[mid] == target) first = mid;
                e = mid - 1; 
            } else {
                s = mid + 1; 
            }
        } 

        // 2. Reset pointers for the last occurrence
        s = 0;
        e = n - 1;

        // 3. Find the last occurrence
        while (s <= e) { 
            int mid = s + (e - s) / 2; 
            if (nums[mid] <= target) { 
                if (nums[mid] == target) last = mid;
                s = mid + 1; 
            } else {
                e = mid - 1; 
            }
        } 

        return new int[]{first, last}; 
    } 
}
