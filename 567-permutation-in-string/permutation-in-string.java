class Solution {
    static boolean compareFreq(int [] count1,  int count2[]){
        for(int i=0;i<26;i++){
            if(count1[i] != count2[i])return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        // s1 ki freq table
        int count1[]=new int[26];
        
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            int index=ch-'a';
            count1[index]++;
        }
        int n=s1.length();
        // s2 ki freq table
        int count2[]=new int[26];
        int i=0;
        for(i=0;i<n;i++){
            char ch=s2.charAt(i);
            int index=ch-'a';
            count2[index]++;
        }
        if(compareFreq(count1,count2)==true){
            return true;
        }
        else{
            // dono freq table nahi match kar rahe then process the remaining table
            while(i<s2.length()){
                char newchar=s2.charAt(i);
                int newCharIndex=newchar- 'a';
                count2[newCharIndex]++;
                int oldCharIndex=i-n;
                char oldchar=s2.charAt(oldCharIndex);
                int freqTableIndexofOldChar=oldchar-'a';
                count2[freqTableIndexofOldChar]--;

                 if(compareFreq(count1,count2)==true){
            return true;
           
        }
         i++;
            }
return false;
        }
    }
}