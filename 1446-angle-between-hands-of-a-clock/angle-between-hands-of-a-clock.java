class Solution {
    public double angleClock(int hour, int minutes) {
        
        double angle=Math.abs(30*hour-5.5*minutes);
        double angle2=360-angle;
        double ans=Math.min(angle,angle2);
        return ans;
        
    }
}