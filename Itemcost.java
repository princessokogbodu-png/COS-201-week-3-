import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Item Cost Calculator ===");

        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter unit price ($): ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double totalCost = unitPrice * quantity;

        System.out.println("\n------------------------");
        System.out.println("Item Summary:");
        System.out.println("Item Name  : " + itemName);
        System.out.println("Unit Price : $" + unitPrice);
        System.out.println("Quantity   : " + quantity);
        System.out.println("------------------------");
        System.out.println("Total Cost : $" + totalCost);
        System.out.println("------------------------");

        scanner.close();
    }
}