public class Findingsumofdigits {

    static int findSum(int num) {
        int sum = 0;

        while (num > 0 || sum > 9) {
            int rem = num % 10;
            sum += rem;

            num /= 10;
            if (num == 0 && sum > 9) {
                num = sum;
                sum = 0;
            }

        }
        System.out.println("sum " + sum);
        return sum;
    }

    public static void main(String[] args) {

        findSum(123598);

    }
}
