class MinStack {
Stack<Integer> stack;
Stack<Integer> minStack = new Stack<>();
Stack<Integer> maxStack = new Stack<>();
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.empty()){
            minStack.push(val);
        }else if(minStack.peek()<val){
            while(!minStack.empty() && minStack.peek()<val){
                maxStack.push(minStack.pop());
            }
            minStack.push(val);
            while(!maxStack.empty()){
                minStack.push(maxStack.pop());
            }
        }else{
            minStack.push(val);
        }
    }
    
    public void pop() {
        int val = stack.pop();
        while(minStack.peek()!= val){
            maxStack.push(minStack.pop());
        }
        minStack.pop();
        while(!maxStack.empty()){
                minStack.push(maxStack.pop());
            }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
