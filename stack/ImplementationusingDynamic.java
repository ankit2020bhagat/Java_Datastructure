import java.util.*;


public class ImplementationusingDynamic {
    public static void main(String[] args) {
          ArrayList<Integer> stack= new ArrayList<>();
          stack.add(10);  
          stack.add(54);
          stack.add(20);
          stack.add(67);
          System.out.println("Pop elemen "+stack.get(stack.size()-1));
          stack.remove(stack.size()-1);
          System.out.println("Stack top element "+stack.get(stack.size()-1));
    }
}
