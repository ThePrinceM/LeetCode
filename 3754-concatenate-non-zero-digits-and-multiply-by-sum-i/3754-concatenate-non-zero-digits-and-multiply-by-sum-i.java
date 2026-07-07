class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return (long)0;
        String nStr=Integer.toString(n);
        char[] ch=nStr.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char e:ch){
            if(e!='0') sb.append(e);
            else continue;
        }
        int fn=Integer.parseInt(sb.toString());
        return (long)sum(fn)*fn;

    }

    int sum(int n){
        int num=n;
        int s=0;
        while(num>0 ){
            s+=num%10;
            num=num/10;
        }
        return s;
    }
}