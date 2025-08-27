import java.util.Stack;
public class PostfixtoPrefix {

    static String postfixPrefix(String str){
          Stack<String> st= new Stack<>();
          for(char ch: str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String top1 = st.pop();
                String top2 = st.pop();
                String ans = ch+top2+top1;
                st.push(ans);
            }
          }
          return st.pop();
    }
    public static void main(String[] args) {
        String Input ="AB-DE+F*/";
        String res = postfixPrefix(Input);
        System.out.println(res);
    }
}
