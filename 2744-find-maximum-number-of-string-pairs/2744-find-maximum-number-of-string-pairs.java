class Solution {

    public String reverse(String s){
        char[] ch=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String str = new String(ch);
        return str;
    }

    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set =new HashSet<>();
        int count=0;
        for(int i=0;i<words.length;i++){
            if(set.contains(reverse(words[i]))){
                count++;
            }else{
                set.add(words[i]);
            }
        }
        return count;
    }
}