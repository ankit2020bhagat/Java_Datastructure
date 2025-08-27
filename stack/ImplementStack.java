
class Stack{
    int top,cap;
    int[] a;

    public Stack(int cap){
        this.cap = cap;
        top =-1;
        a = new int[cap];

    }

    public boolean isFull(){
        return top == (cap-1);
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean push(int x){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
         }
        a[++top] = x;
        return true;

    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return a[top--];
       
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return a[top];
    }

}

public class ImplementStack {
   public static void main(String[] args) {
    Stack s = new Stack(5);
    s.push(2);
    s.push(3);
    s.push(4);
    int data = s.pop();
    System.out.println("data "+data);
    int peek = s.peek();
    System.out.println("Peek element "+peek);
   } 
}
