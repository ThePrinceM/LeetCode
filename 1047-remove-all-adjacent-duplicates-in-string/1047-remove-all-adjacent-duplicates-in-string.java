class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char e:s.toCharArray()){
            if(st.isEmpty() || st.peek()!=e){
                st.push(e);
            }else if(st.peek()==e){
                st.pop();
                continue;
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        
    }
}