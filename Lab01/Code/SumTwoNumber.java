import java.util.Scanner;

public class SumTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String strNum1 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1);

        
        System.out.print("Enter the second number: ");
        String strNum2 = scanner.nextLine();
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        double difference = num1 - num2;
        System.out.println("Difference: " + difference);

        double product = num1 * num2;
        System.out.println("Product: " + product);


        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Quotient: Cannot divide by zero.");
        }


        scanner.close();
    }
}