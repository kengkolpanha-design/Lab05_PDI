import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Sum from 1 to n");
            System.out.println("6. Exit");
            System.out.print("Select an operation (1-6): ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case 1: 
                        System.out.println("Result: " + (num1 + num2)); 
                        break;
                    case 2: 
                        System.out.println("Result: " + (num1 - num2)); 
                        break;
                    case 3: 
                        System.out.println("Result: " + (num1 * num2)); 
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.print("Enter a positive integer n: ");
                int n = scanner.nextInt();
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println("Result: " + sum);
            } else if (choice != 6) {
                System.out.println("Invalid selection. Please try again.");
            }

        } while (choice != 6);

        System.out.println("Exiting calculator.");
        scanner.close();
    }
}