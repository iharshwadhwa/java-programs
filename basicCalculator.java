import java.util.*;

public class basicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        char c = sc.next().charAt(0);
        calculator(x, y, c);
        sc.close();
    }

    static void calculator(int x, int y, char operator) {
        if (operator == '+') {
            System.out.println(x + y);
        } else if (operator == '-') {
            System.out.println(x - y);
        } else if (operator == '*') {
            System.out.println(x * y);
        } else if (operator == '/') {
            if (y != 0) {
                System.out.println(x / y);
            } else {
                System.out.println("Indefinite");
            }
        } else {
            System.out.println("invalid");
        }

    }

}
