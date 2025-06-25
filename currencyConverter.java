import java.util.*;

public class currencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();

        System.out.println("$" + convert(amount));

        sc.close();
    }

    static double convert(double amount) {
        double USD = amount / 86.06;
        return USD;
    }
}
