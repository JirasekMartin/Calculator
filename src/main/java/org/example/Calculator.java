package org.example;


import java.util.Scanner;

public class Calculator {
    private static double memory = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Memory Recall");
            System.out.println("6. Memory Clear");
            System.out.println("7. Switch to Scientific Mode");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        performOperation("add");
                        break;
                    case 2:
                        performOperation("subtract");
                        break;
                    case 3:
                        performOperation("multiply");
                        break;
                    case 4:
                        performOperation("divide");
                        break;
                    case 5:
                        memoryRecall();
                        break;
                    case 6:
                        memoryClear();
                        break;
                    case 7:
                        switchToScientificMode();
                        break;
                    case 8:
                        System.out.println("Exiting the Calculator. Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 8.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 8.");
            }
        }
    }

    private static void performOperation(String operation) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first operand: ");
        double operand1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the second operand: ");
        double operand2 = Double.parseDouble(scanner.nextLine());

        double result = 0;

        switch (operation) {
            case "add":
                result = operand1 + operand2;
                break;
            case "subtract":
                result = operand1 - operand2;
                break;
            case "multiply":
                result = operand1 * operand2;
                break;
            case "divide":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
        }

        System.out.println("Result: " + result);
        memory = result; // Uložení výsledku do paměti
    }

    private static void memoryRecall() {
        System.out.println("Memory Recall: " + memory);
    }

    private static void memoryClear() {
        memory = 0;
        System.out.println("Memory Cleared.");
    }

    private static void switchToScientificMode() {
        // Zde můžete přidat další funkce pro vědecký režim
        System.out.println("Switching to Scientific Mode.");
    }
}