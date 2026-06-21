class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // if(costs.length==0)return 0;
        Arrays.sort(costs);
        int max = 0;
        for (int i = 0; i < costs.length; i++) {
            if (coins >= costs[i]) {
                coins -= costs[i];
                max++;
            } else if (coins < costs[i])
                break;
        }
        return max;

    }
}