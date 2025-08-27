import java.util.Stack;
public class InfixtoPostfix {

    static int precendence(char ch){
       if(ch =='^'){
        return 3;
       }
       else if(ch =='*' || ch =='/'){
        return 2;
       }
       else if(ch =='+' || ch == '-'){
        return 1;
       }
       else{
        return -1;
       }
    }

    static String inforxtopostfix(String str){

        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(char ch:str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            }

            else if(ch =='('){
                st.push(ch);
            }
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && precendence(ch)<=precendence(st.peek()) ){
                    ans.append(st.pop());
                }
                st.push(ch);
            }

        }
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }
        return ans.toString();

    }
    
    public static void main(String[] args) {
       String exp = "a+b*(c^d-e)";
       System.out.println(inforxtopostfix(exp));
      
    }
}
