import java.util.*;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount");
        int principal = sc.nextInt();
        System.out.println("Enter Rate of interest");
        int Rate = sc.nextInt();
        System.out.println("Enter the Duration");
        int Time = sc.nextInt();

        System.out.println(interest(principal, Rate, Time));
        ;

        sc.close();
    }

    static int interest(int P, int R, int T) {
        int SI = (P * R * T) / 100;

        return SI;
    }
}
