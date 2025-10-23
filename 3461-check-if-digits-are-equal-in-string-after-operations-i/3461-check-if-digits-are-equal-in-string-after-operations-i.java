class Solution {
    public boolean hasSameDigits(String s) {
        char[] ch=s.toCharArray();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<ch.length;i++){
            ans.add(ch[i]-'0');
        }
        int n=ans.size();
        while(n>2){
            for(int i=1;i<n;i++){
            int sum=(ans.get(i)+ans.get(i-1))%10;
            ans.set(i-1,sum);
            }
            n--;
        }
      return ans.get(0)==ans.get(1);
    }
}