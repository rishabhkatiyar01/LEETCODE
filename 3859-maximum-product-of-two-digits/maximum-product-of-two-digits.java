class Solution {
    public int maxProduct(int n) {
        int ans=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(n!=0){
            int rem=n%10;
            arr.add(rem);
            n/=10;
        }
      for(int i=0;i<arr.size();i++){
        for(int j=i+1;j<arr.size();j++){
            int product=arr.get(i)*arr.get(j);
            ans=Math.max(ans, product);
        }
      }
        return ans;
    }
}