class Solution {
    public int countCommas(int n) {
        if(count(n)>=4) return n - 1000 +1;
        else return 0;
    }

    public int count(int n){
        int c = 0;
        while( n > 0){
            n /= 10;
            c++;

        }
        return c;
    }
}