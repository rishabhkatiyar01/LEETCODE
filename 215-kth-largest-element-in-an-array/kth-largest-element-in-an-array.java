class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num); // Add current element

            // If the heap grows larger than k, drop the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // The root element is now the k-th largest element
        return minHeap.peek();
    }
}
