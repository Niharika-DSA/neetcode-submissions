class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack= new Stack<>(); 

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);
        int min=minStack.isEmpty()?val:Math.min(val,minStack.peek());
        minStack.push(min);
        
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
