import java.util.*;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int n = sc.nextInt();
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            System.out.println("it is a leap year");
        } else {
            System.out.println("it is a normal year");
        }
        sc.close();

    }
}