import java.util.Scanner;
public class temper {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice=0;
        double temperature;
        while(choice!=3) {
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    temperature = scanner.nextDouble();
                    celsiusToFahrenheit(temperature);
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    temperature = scanner.nextDouble();
                    fahrenheitToCelsius(temperature);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }   
        }
    }
    public static void celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
    }
    public static void fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
    }
}
