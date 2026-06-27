class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int size=0;
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{') {
                st.push(c);
                size++;
            }
            else {
                if (st.isEmpty()) return false; // prevent peek on empty stack
                if ((c == ')' && st.peek() == '(') ||
                    (c == ']' && st.peek() == '[') ||
                    (c == '}' && st.peek() == '{')) {
                    st.pop();
                } else {
                    return false; // mismatch case
                }
            }
        }
        return st.isEmpty();

    }
}