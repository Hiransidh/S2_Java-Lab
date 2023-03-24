import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        double num1, num2, result;
        while (choice != 4) {
            System.out.println("\nMenu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            System.out.print("Enter first number: ");
            num1 = input.nextDouble();
            System.out.print("Enter second number: ");
            num2 = input.nextDouble();
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } 
    }
}
