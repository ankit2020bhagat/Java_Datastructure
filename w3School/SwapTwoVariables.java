
public class SwapTwoVariables {
    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 67;
        System.out.println("Before swap " + num1 + " " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap " + num1 + " " + num2);
    }
}
