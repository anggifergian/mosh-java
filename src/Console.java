import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);
    public static double readNumber(String prompt, double min, double max) {
        // Variable to store value entered by scanner
        double value;

        while(true) {
            // Show input scanner to user
            System.out.println(prompt);
            value = scanner.nextDouble();

            // Validate a value, if valid then break over the while loop
            if (value >= min && value <= max)
                break;

            // Generate dynamic error message based on min and max validator
            System.out.println("Enter a value between " + min + " and " + max);
        }

        return value;
    }
}
