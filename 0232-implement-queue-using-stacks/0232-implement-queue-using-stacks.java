class MyQueue {

    Stack<Integer> st=new Stack<>();
    Stack<Integer> help=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!st.isEmpty()){
            help.push(st.pop());
        }
        st.push(x);
        while(!help.isEmpty()){
            st.push(help.pop());
        }

    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        if(st.size()==0) return true;
        else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */