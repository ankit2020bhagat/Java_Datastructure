package java_datastructure.queue;
import java.util.Stack;
public class QueueusingStacks {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void enqueue(int x){

        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        s1.push(x);

        while(!s2.empty()){
            s1.push(s2.pop());
        }
    }

    static int dequeue(){
        if(s1.empty()){
            return -1;
        }
        return s1.pop();
    }
    public static void main(String[] args) {
        enqueue(2);
        enqueue(4);
        enqueue(6);

        System.out.println(dequeue());
    }
}
