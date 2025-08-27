import java.util.Stack;
public class Reverseindividualwords {

    static String reverseString(String str){
         Stack<Character> st = new Stack<>();

         for(char ch :str.toCharArray()){
            st.push(ch);
         }
         String newStr ="";
         while (!st.empty()) {
            newStr +=st.pop();
         }
         return newStr;
    }
    public static void main(String[] args) {
        String input ="Ankit Kumar";
        String res = reverseString(input);
        System.out.println(res);
    }
}
