import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        System.out.println("Welcome to the calculator!");
        System.out.println("Enter a command:");

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        String command = scanner.next();
        while (!Objects.equals(command, "quit")) {

            if (Objects.equals(command, "fibonacci") || Objects.equals(command, "binary")) {
                // read only 1 arg
                num1 = Integer.parseInt(scanner.next());
                if (command.equals("fibonacci")) {
                    System.out.println(calculator.fibonacciNumberFinder(num1));
                } else { // binary
                    System.out.println(calculator.intToBinaryNumber(num1));
                }
            } else {
                num1 = Integer.parseInt(scanner.next());
                num2 = Integer.parseInt(scanner.next());
                if (Objects.equals(command, "add")) {
                    System.out.println(calculator.add(num1, num2));
                } else if (Objects.equals(command, "subtract")) {
                    System.out.println(calculator.subtract(num1, num2));
                } else if (Objects.equals(command, "divide")) {
                    System.out.println(calculator.divide(num1, num2));
                } else if (Objects.equals(command, "multiply")) {
                    System.out.println(calculator.multiply(num1, num2));
                }
            }
            command = scanner.next();
        }
    }


}
