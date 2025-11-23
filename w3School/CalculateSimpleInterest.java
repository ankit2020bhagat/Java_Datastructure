public class CalculateSimpleInterest {

    static double simpleinterest(int principal, double rate, int time) {
        double amount = (principal * rate * time) / 100;

        return amount;
    }

    public static void main(String[] args) {

        double amount = simpleinterest(10000, 2.5, 23);
        System.out.println(amount);

    }
}
