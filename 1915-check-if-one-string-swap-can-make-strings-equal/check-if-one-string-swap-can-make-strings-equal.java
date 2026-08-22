class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2) return false;
         int count=0;
         for(int i=0;i<n1;i++){
            if(s1.charAt(i)!=s2.charAt(i) && count<=2)
            count++;
            if(count>2)return false;;
         }
     HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0;i<n1;i++){
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);

            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }
        return map1.equals (map2);

    }
}