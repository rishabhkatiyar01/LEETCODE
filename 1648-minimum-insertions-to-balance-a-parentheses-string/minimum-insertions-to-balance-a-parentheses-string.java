class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int openNeeded = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                openNeeded += 2;
                if (openNeeded % 2 == 1) {
                    insertions++;
                    openNeeded--;
                }
            } else {
                openNeeded--;
                if (openNeeded < 0) {
                    insertions++;
                    openNeeded += 2;
                }
            }
        }
        
        return insertions + openNeeded;
    }
}
