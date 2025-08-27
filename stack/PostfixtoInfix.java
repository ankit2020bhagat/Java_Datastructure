import java.util.Stack;

public class PostfixtoInfix {
    static String postfixtoinfix(String str){
        Stack<String> st = new Stack<String>();
        for(char ch:str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String top1 = st.pop();
                String top2 = st.pop();
                String ans = '(' +top2+ch+top1+')';
                st.push(ans);
            }
        }
        return st.pop();
    }
    
    public static void main(String[] args) {
        String input ="AB-DE+F*/";
        String res = postfixtoinfix(input);
        System.out.println(res);
    }
}
