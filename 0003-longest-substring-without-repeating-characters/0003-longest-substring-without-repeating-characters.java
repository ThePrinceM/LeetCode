class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        if(n<=1) return n;
        int maxLen=0;
        int i=0,j=0;
        while(j<n){
            char ch=s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i){  
                int len=j-i;
                maxLen=Math.max(len,maxLen);
                while(s.charAt(i)!=ch) i++;
                i++;
                
            }
            map.put(ch,j);
            j++;
            
        }
        int len=j-i;
        maxLen=Math.max(len,maxLen);
        return maxLen;
    }
}