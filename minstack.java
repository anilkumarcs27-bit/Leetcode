import java.util.Stack;

public class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer>min = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        s.push(val);
        if(min.isEmpty()) min.push(val);
        else if( val <= min.peek()) min.push(val);
    }
    
    public void pop() {
        int data = s.pop();
        if(data== min.peek()) min.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
