package DSA;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("This is a simple calculator based on Five operators:" + " %+ - * / %");
            System.out.println("you can quite by pressing 'X' or 'x ");
            while (true) {
                System.out.print("Enter the operator: ");
                char op = input.next().trim().charAt(0);

                if (op == 'x' || op == 'X') {
                    System.out.println("Exiting calculator...");
                    break;
                }
                System.out.println("Enter two numbers");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int result;
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    if (op == '+') {
                        result = num1 + num2;
                        System.out.println("Addition of " + num1 + " and " + num2 + " = " + result);
                    }
                    if (op == '-') {
                        result = num1 - num2;
                        System.out.println("Subtraction of " + num1 + " and " + num2 + " = " + result);
                    }
                    if (op == '*') {
                        result = num1 * num2;
                        System.out.println("Multiplication of " + num1 + " and " + num2 + " = " + result);
                    }
                    if (op == '/') {
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Division of " + num1 + " and " + num2 + " = " + result);
                        } else {
                            System.out.println("can't divide by zero.");
                        }
                    }
                    if (op == '%') {
                        if (num2 != 0) {
                            result = num1 % num2;
                            System.out.println("Modulus of " + num1 + " and " + num2 + " = " + result);
                        } else {
                            System.out.println("can't find Modulus with zero");
                        }
                    }

                } else {
                    System.out.println("Invalid input");
                }
            }
        }
    }
}
