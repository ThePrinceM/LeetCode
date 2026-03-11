class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='1') ch[i]='0';
            else ch[i]='1';
        }
        String ans=new String(ch);
        int decimal = Integer.parseInt(ans, 2);
        return decimal;
    }
}