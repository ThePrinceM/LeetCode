class Solution {
    // public boolean isAnagram(String s, String t) {
    //     if(s.length()!=t.length()) return false;
    //     char[] ch=s.toCharArray();
    //     Arrays.sort(ch);
    //     char[] ch1=t.toCharArray();
    //     Arrays.sort(ch1);
    //     for(int i=0;i<ch.length;i++){
    //         if(ch[i]!=ch1[i]) return false;
    //     }
    //     return true;   
    // }

    //using hashmap
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> smap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            if(smap.containsKey(key)){
                int freq=smap.get(key);
                smap.put(key,freq+1);
            }
            else smap.put(key,1);
        }

        HashMap<Character,Integer> tmap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char key=t.charAt(i);
            if(tmap.containsKey(key)){
                int freq=tmap.get(key);
                tmap.put(key,freq+1);
            }
            else tmap.put(key,1);
        }
        for (char key : smap.keySet()) {
            if (!tmap.containsKey(key) || !smap.get(key).equals(tmap.get(key))) {
                return false;
            }
        }

        return true;
    }
}