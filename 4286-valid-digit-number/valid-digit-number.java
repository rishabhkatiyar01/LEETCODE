class Solution {

    public boolean validDigit(int n, int x) {
        
        String str=n+"";
       char a=(char)(x +'0');

        if(str.charAt(0)==a)return false;

        for(int i=1;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch==a) return true;
        }
        return false;
    }
}