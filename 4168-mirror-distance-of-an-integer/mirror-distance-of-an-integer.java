class Solution {
    public int rev(int x){
         int rev=0;
   
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x/=10;
   }return rev;
    }
    public int mirrorDistance(int n) {
       return Math.abs(n-rev(n));

        
    }
}