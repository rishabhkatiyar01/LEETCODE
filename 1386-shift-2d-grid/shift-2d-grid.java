class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

         Deque<Integer> ans=new ArrayDeque<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans.add(grid[i][j]);
            }
        }

        k=k%ans.size();
        for(int i=0;i<k;i++){
            int ele=ans.getLast();
           ans.offerFirst(ele);
           ans.removeLast();

        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                currentRow.add(ans.pollFirst());
            }
            result.add(currentRow);
        }

        return result;
    }
}