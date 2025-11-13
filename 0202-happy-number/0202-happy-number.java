class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        if (n == 1) return true;
        while(n>0) {
            
            int lastDig = n%10;
            sum += Math.pow(lastDig, 2);
            n /= 10;

            if (n == 0) {
                if (sum == 1) {
                    return true;
                } else {
                    n = sum;
                }
            }
        }
        return false;
    }
}