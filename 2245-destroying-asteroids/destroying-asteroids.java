class Solution {
    public boolean asteroidsDestroyed(int m, int[] asteroids) {
        Arrays.sort(asteroids);
        long  mass=m;
        for(int i=0;i<asteroids.length;i++){
          

           if(mass<asteroids[i])return false;
            mass+=asteroids[i];
        }
        
        return true;
        
    }
}