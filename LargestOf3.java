import java.util.*;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(max(a, b, c));
        sc.close();
    }

    // static void max(int a, int b, int c) {
    // int maximum = Math.max(a, Math.max(b, c));
    // System.out.println(maximum);
    // }

    static int max(int a, int b, int c) {
        int temp;
        if (a > b) {
            temp = a;
        } else {
            temp = b;
        }
        if (c > temp) {
            temp = c;
        }

        return temp;
    }
}
