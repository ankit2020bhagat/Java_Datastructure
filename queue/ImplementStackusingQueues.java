
package java_datastructure.queue;

import java.util.Queue;
import java.util.LinkedList;
public class ImplementStackusingQueues {
    
    static Queue<Integer> q = new LinkedList<>() ;

    static int size;
    public ImplementStackusingQueues(int s){
        size =s;
    }

    static boolean push(int x){
        q.add(x);
        int size = q.size();
        while (size-- > 1) {
            q.add(q.remove());
        }
        return true;
    }

   static Integer pop(){
        return q.remove();

   }


    static Integer top(){
        return q.peek();
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);

        System.out.println(top());
        System.out.println(pop());
        System.out.println(top());
    }
        
    
}
