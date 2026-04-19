class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxDist = 0;
        int m = nums1.length;
        int n = nums2.length;
        for (int i = 0; i < m; i++) {
            int low = i, high = n - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums2[mid] >= nums1[i]) {
                    maxDist = Math.max(maxDist, mid - i);
                    low= mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return maxDist;
    }
}