class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> sts=new Stack<>();
        Stack<Character> stt=new Stack<>();
        for(char e:s.toCharArray()){
            if(e=='#') {
                if(!sts.isEmpty()) sts.pop();
            }
            else sts.push(e);
        }
        for(char e:t.toCharArray()){
            if(e=='#') {
                if(!stt.isEmpty()) stt.pop();
            }
            else stt.push(e);
        }
        StringBuilder sb1 = new StringBuilder();
        for (char c : sts) sb1.append(c);

        StringBuilder sb2 = new StringBuilder();
        for (char c : stt) sb2.append(c);

        return sb1.toString().equals(sb2.toString());
    }
}