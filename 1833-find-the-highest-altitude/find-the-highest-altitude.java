class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(0);
        int max=0;
        for(int i=0;i<gain.length;i++){
            int next=arr.get(i)+gain[i];
            if (next>arr.get(i)){
               max=Math.max(max,next);
            }
            arr.add(next);
        }
        return max;
    }
}