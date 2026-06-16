import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String processStr(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                list.add(ch);
            }
            else if (ch == '*') {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
            }
            else if (ch == '#' && i > 0) {
                int S= list.size();
                for (int j = 0; j < S; j++) {
                    list.add(list.get(j));
                }
            }
            else if (ch == '%') {
                Collections.reverse(list);
            }
        }   
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        return sb.toString();
    }
}
