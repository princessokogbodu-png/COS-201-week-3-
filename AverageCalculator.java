import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Average Calculator ===");
        System.out.print("Enter the number of values you want to average: ");
        
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a positive number of values.");
            scanner.close();
            return;
        }

        double sum = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            double currentNumber = scanner.nextDouble();
            sum += currentNumber;
        }

        double average = sum / count;

        System.out.println("\n------------------------");
        System.out.println("Total Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("------------------------");

        scanner.close();
    }
}