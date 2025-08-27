import java.util.Stack;

public class PrefixtoPostfix {

    static String prefixToPostfix(String str){
        Stack<String> st = new Stack<String>();
        String reversed = new StringBuilder(str).reverse().toString();
        for(char ch :reversed.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String top1= st.pop();
                String top2 = st.pop();
                String ans = top1+top2+ch;
                st.push(ans);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String Input ="/-AB*+DEF";
        String res =prefixToPostfix(Input);
        System.out.println(res);
    }
}
