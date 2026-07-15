class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=n*n;
        int even=n*(n+1);
        int gcd=1;
        for(int i=1;i<=n;i++){
            if(odd%i==0 && even%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}