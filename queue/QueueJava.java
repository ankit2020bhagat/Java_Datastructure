package java_datastructure.queue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueJava {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Ankit");
        queue.add("kumar");
        queue.add("bhagat");
        queue.remove();
        System.out.println(queue.peek());

        System.out.println(queue);
    }
    
}
