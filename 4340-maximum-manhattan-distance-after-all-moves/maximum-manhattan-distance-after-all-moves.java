class Solution {
    public int maxDistance(String moves) {

        int h=0;
        int v=0;
        int u=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                v++;
            }
            else if(ch=='D'){
                v--;
            }
            else if(ch=='L'){
                h--;
            }
            else if(ch=='R'){
                h++;
            }
            else u++;
        }
        int net=Math.abs(h)+Math.abs(v)+u;
        return net;
    }
}