import java.util.*;

public class hcfAndLcm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int hcf = computeHcF(m, n);
        int lcm = (m * n) / hcf;

        System.out.println("HCF " + hcf);
        System.out.println("LCM " + lcm);

        sc.close();

    }

    static int computeHcF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}