class Solution {
    public int mirrorDistance(int n) {
        if(n<10) return 0;
        return Math.abs(n-reverse(n));
    }

    public int reverse(int n){
        int rev=0;
        int digit=0;
        while(n!=0){
            digit=n%10;
            rev=rev*10 + digit;
            n=n/10;
        }
        return rev;
    }
}