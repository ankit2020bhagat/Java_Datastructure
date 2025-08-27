package java_datastructure.queue;

class Node{
     int data;
     Node next;
     Node(int x){
        data = x;
        next =null;
     }
}

public class QueuLinked {
    Node front=null;

    Node rear;

    public Node enqueue(int x){
      Node newNode = new Node(x);
      if(front == null){
         front =rear= newNode;
         return front;
      }
      rear.next = newNode;
      rear = newNode;

      return front;
    }

    public int dequeue(){
      if(front == null){
         System.out.println("Queue is null");
      }
      int data = front.data;
      front  = front.next;
      return data;
    }

    public int getFront(){
       if(front == null){
         System.out.println("Queue is null");
         return -1;
      }
      return front.data;
    }

   public int getRear(){
      if(front == null){
         System.out.println("Queue is null");
         return -1;
      }
      return rear.data;
   }

   public static void main(String[] args) {
      QueuLinked obj = new QueuLinked();
      obj.enqueue(45);
      obj.enqueue(56);
      obj.enqueue(78);
      System.out.println(obj.getFront());
      System.out.println(obj.getRear());
      System.out.println(obj.dequeue());
      System.out.println(obj.getFront());
   }
    
}
