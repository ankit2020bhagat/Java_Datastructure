package java_datastructure.queue;

public class CircularArrayQueue {
    private int[] arr ;
    private int front,size,capacity;

    public CircularArrayQueue(int c){
        arr = new int[c];
        capacity = c;
        front =0;
        size =0;
    }

    public void enqueue(int x){
        if(size ==capacity ){
            System.out.println("Queue is full");
        }
        int rear = (front+size) % capacity;
        arr[rear] = x;
        size++;
    }

    public int dequeue(){
        if(size == 0){
        System.out.println("Queue is empty");
        }
        int res= arr[front];
        front = (front+1)%capacity;
        size--;
        return res;
        
    }

    public int front(){
        if(size == 0){
           System.out.println("Queue is empty");
        }
        return arr[front];
    }

    public int getRear(){
        if(size ==0){
            return -1;
        }
        int res = (front+size -1) % capacity;
        return arr[res];
    }
    public static void main(String[] args) {
        
        CircularArrayQueue obj = new CircularArrayQueue(4);
        obj.enqueue(34);
        obj.enqueue(56);
        obj.enqueue(23);
        obj.enqueue(89);
       
    System.out.println(obj.dequeue());
     obj.enqueue(412);
    }
    
}
