import java.util.Stack;
public class MinStack {

    static class Pair {
        int value;
        int currentMin;

        Pair(int value, int currentMin) {
            this.value = value;
            this.currentMin = currentMin;
        }
    }

    


    static int minStack(int[] arr,Stack<Pair> minStack){
           
           
           for(int i=0;i<arr.length;i++){
               if(minStack.empty()){
                minStack.push(new Pair(arr[i], arr[i]));
               }
               else{
                int min = Math.min(minStack.peek().currentMin,arr[i]);
                minStack.push(new Pair(arr[i], min));
                
               }
           }

           return minStack.peek().currentMin;
           
    }
    public static void main(String[] args) {
        Stack<Pair>minStack = new Stack<>();
        int[] arr ={12,15,10,9};
        int min = minStack(arr,minStack);
        System.out.println( minStack.pop().value);
        System.out.println( minStack.pop().value);
        System.out.println(minStack.peek().value);
      
    }
}
