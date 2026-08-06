class Solution {
    public int smallestNumber(int n, int t) {   
        int i=n; 
        for(i=n;i<=n+10;i++){
            if(product(i)%t==0) return i;

        }
        return -1;
    }

    public int product(int a){
        int ans=1;
        while(a>0){
            ans*=a%10;
            a/=10;
        }
        return ans;
    }
}