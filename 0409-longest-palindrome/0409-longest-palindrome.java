class Solution {
    public int longestPalindrome(String s) {
        TreeMap<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        boolean flag=false;

        for(char key:map.keySet()){
            int val=map.get(key);
            if(val%2==0) count+=val;
            else{
                flag=true;
                count+=val-1;
            }
        }
        if(flag==true) return count+1;
        return count;
    }
}