class MinStack {
Stack<Integer> stack;
Stack<Integer> minStack = new Stack<>();
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.empty()){
            minStack.push(val);
        } else if(val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        int val = stack.pop();
        if(minStack.peek() == val){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
