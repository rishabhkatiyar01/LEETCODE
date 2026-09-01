class Solution {

    public static void solve(int[] nums, List<Integer> ans, List<List<Integer>> output, boolean[] used) {
        if (ans.size() == nums.length) {
            output.add(new ArrayList<>(ans));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i]) {
                continue;
            }

            // Choose
            used[i] = true;
            ans.add(nums[i]);

            // Explore
            solve(nums, ans, output, used);

            // Backtrack
            ans.remove(ans.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();

        boolean[] used = new boolean[nums.length];

        solve(nums, ans, output, used);

        return output;
    }
}
