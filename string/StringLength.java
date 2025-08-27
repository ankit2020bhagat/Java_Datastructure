package java_datastructure.string;

public class StringLength {

    static int getLength(String s){
        int count =0;
        // System.out.println(s.toCharArray());
        for(char c:s.toCharArray()){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str1 ="ankit kumar";
        int length = getLength(str1);
        System.out.println(length);
    }
}
