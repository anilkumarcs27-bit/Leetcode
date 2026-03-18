// https://leetcode.com/problems/design-circular-queue/description/
// Question - Design circular queue
class MyCircularQueue {
    int front = -1,rear = -1;
    int k;
    int [] queue;
    public MyCircularQueue(int k) {
      this.k = k;
         queue = new int[this.k];  
    }
    
    public boolean enQueue(int value) {
       if(front==-1) {
            front = 0;
           
       }
       else if((rear+1)%k == front) return false;

       rear = (rear+1) % k;
       queue[rear] = value;
       return true; 
    }
    
    public boolean deQueue() {
      if(front==-1) return false;
      else if(front == rear) {
        front = -1;
        rear = -1;
        return true;
      }  

      front = (front+1)%k;
      return true;
    }
    
    public int Front() {
        if(front==-1)return -1;
      return queue[front];  
    }
    
    public int Rear() {
        if(rear ==-1) return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        return front==-1;
    }
    
    public boolean isFull() {
       return (rear+1)%k == front;
    }
}
