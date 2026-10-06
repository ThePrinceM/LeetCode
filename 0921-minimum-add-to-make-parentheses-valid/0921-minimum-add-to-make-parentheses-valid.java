class Solution {
    public int minAddToMakeValid(String s) {
        int op = 0;
        int req = 0;
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(') op++;
            else {
                if (op > 0) {
                    op--;
                } else {
                    req++;
                }
            }
        }
        return req + op;
    }
}