import java.util.Stack;
public class ValidParentheses {

    static boolean validParentheses(String str){
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                st.push(str.charAt(i));
               
            }
            
            else{
               
                char top = st.peek();
                if(!st.empty() && ((str.charAt(i) ==')' && top == '(') || (str.charAt(i) == '}' && top =='{') || (str.charAt(i) ==']' && top =='['))){
                     st.pop();
                }
                
            }
        }
        return st.isEmpty();
    }
   public static void main(String[] args) {
    String input ="([{]})";
    boolean res=validParentheses(input);
    System.out.println(res);
   } 
}
