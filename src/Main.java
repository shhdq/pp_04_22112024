import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);

        Car car1 = new Car("BMW", 10);

        car1.startCar();

        while (true) {
            System.out.println("Choose an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int user_choice = scan.nextInt();

            if (user_choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            if (user_choice < 1 || user_choice > 4) {
                System.out.println("Invalid choice");
                continue;
            }

            System.out.println("Enter first number: ");
            double num1 = scan.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scan.nextDouble();

            // init result
            double result = 0;

            switch (user_choice) {
                case 1:
                    result = calc.add(num1, num2);

                    break;
                case 2:
                    result = calc.subtract(num1, num2);

                    break;
                case 3:
                    result = calc.multiply(num1, num2);

                    break;
                case 4:
                    result = calc.divide(num1, num2);

                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Result: " + result);
        }

        scan.close();
    }
}