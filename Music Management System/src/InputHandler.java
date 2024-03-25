
import java.util.Scanner;

public class InputHandler {
    private static final Scanner sc = new Scanner(System.in);

    public static int getIntInput(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }

    public static String getStringInput(String prompt) {
        System.out.println(prompt);
        return sc.next();
    }

    public static void closeScanner() {

        sc.close();
    }
}