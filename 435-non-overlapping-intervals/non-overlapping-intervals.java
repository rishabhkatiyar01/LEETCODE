class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals, Comparator.comparingDouble(o -> o[1]));
         int max=0;
         max=1;
        int lastend=intervals[0][1];
         for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=lastend){
                max++;
                lastend=intervals[i][1];
            }
         }
        return intervals.length-max;
    }
}