import java.util.*;

public class evenORodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        check(a);

        sc.close();
    }

    static void check(int x) {
        if (x % 2 == 0) {
            System.out.println("the number is even");
        } else if (x == 0) {
            System.out.println("you entered 0");
        } else {
            System.out.println("you entered an odd number");
        }

    }
}
