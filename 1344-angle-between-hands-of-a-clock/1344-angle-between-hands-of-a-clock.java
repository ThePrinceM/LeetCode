class Solution {
    public double angleClock(int hour, int minutes) {
        double ans=Math.abs(5.5*(double)minutes - 30.0*(double)hour);
        if(ans>180) ans=360-ans;
        return ans;
    }
}