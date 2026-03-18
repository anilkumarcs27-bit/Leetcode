// make O(n) complexity for push and O(1) for pop
class MyStack {
    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q2.offer(x);

        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;


    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
       return q1.peek();
    }
    
    public boolean empty() {
        if(q1.isEmpty()) return true;
        return false;
    }
}

// O(1) for push and O(n) for pop
class MyStack {
    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
       q1.offer(x);
    }
    
    public int pop() {
       int size = q1.size();
        for(int i=0;i<size-1;i++){
            q2.offer(q1.poll());
        }
        int data = q1.poll();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return data;
    }
    
    public int top() {
        int size = q1.size();
         for(int i=0;i<size-1;i++){
            q2.offer(q1.poll());
        }

        int data = q1.peek();
        q2.offer(q1.poll());

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return data;
    }
    
    public boolean empty() {
        if(q1.isEmpty()) return true;
        return false;
    }
}
