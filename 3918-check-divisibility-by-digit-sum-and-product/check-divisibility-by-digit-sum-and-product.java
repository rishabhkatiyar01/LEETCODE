class Solution {
    public static int sumofdig(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static int prodofdig(int n){
        int prod=1;
        while(n!=0){
            prod*=n%10;
            n/=10;
        }
        return prod;
    }
    public boolean checkDivisibility(int n) {
        int sum=sumofdig(n);
        int prod=prodofdig(n);

         if(n%(sum+prod)==0) return true;
         return false;
    }
}