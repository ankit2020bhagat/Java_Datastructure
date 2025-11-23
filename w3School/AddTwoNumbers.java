
import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first number 1");
        num1 = obj.nextInt();

        System.out.println("Enter the second number");
        num2 = obj.nextInt();

        sum = num1 + num2;
        System.out.println("Sum of two numbers " + sum);
        obj.close();
    }

}