class Node{
    int data,top;
    Node next;
    public Node(int newdata){
        this.data = newdata;
        top =-1;
        next =null;
    }
}

public class Stackusingsinglylinkedlist {
    Node head ;
    public Stackusingsinglylinkedlist(){
        this.head = null;
    }

    public  boolean isEmpty(){
        return this.head==null;
    }

    public boolean push(int newData){
        Node newNode = new Node(newData);
        if(this.head == null){
            this.head = newNode;
            return true;
        }
        newNode.next = head;
        this.head = newNode;
        return true;
    }


    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int data = head.data;
        head =head.next;
        return data;

    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return head.data;
    }
    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Stackusingsinglylinkedlist s = new Stackusingsinglylinkedlist();       
       s.push(12);        
       s.push(66);
       s.push(90);
       s.push(12);
       int data =s.pop();
       System.out.println("Pop elelemt "+data);
       int peek = s.peek();
       System.out.println("Peek elelemt"+ peek);
        int data1 =s.pop();
       System.out.println("Pop elelemt "+data1);
       s.display();
    }
}
