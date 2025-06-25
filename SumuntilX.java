import java.util.*;

public class SumuntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            String input = sc.next();

            if (input.equals("x")) {
                break;
            }
            sum += Integer.parseInt(input);
        }
        System.out.println(sum);
        sc.close();
    }
}
