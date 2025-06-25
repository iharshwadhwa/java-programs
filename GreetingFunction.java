import java.util.*;

public class GreetingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name + ", " + greeting(name));
        sc.close();
    }

    static String greeting(String message) {
        return "Have a good day";
    }
}
