/*1.Create a Java program that acts as a simple calculator.

● The program should prompt the user to enter two numbers and an operator (+, -,

*, /).

● Perform the corresponding calculation based on the operator.

● Handle potential exceptions, such as division by zero or invalid operator input.

● Display the result or an appropriate error message.*/



package multithreading;

import java.util.Scanner;

public class SimpleCalculatore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt the user to enter two numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            // Prompt the user to enter an operator
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            
            // Perform the corresponding calculation based on the operator
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator. Please use +, -, *, or /.");
            }
            
            // Display the result
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            // Handle invalid operator exception
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
/* Output:
Enter the first number: 45
Enter the second number: 56
Enter an operator (+, -, *, /): +
The result is: 101.0
*/
