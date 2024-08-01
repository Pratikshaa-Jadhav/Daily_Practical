/* 2. Write a Java program that throws an exception and catch it using a try-catch block. */
// Java program demonstrating try-catch block for handling exceptions

public class ThrowsException {
    public static void main(String[] args) {
        // Initialize variables
        int firstNumber = 20;
        int secondNumber = 0;
        int result;

        try {
            // Code inside try block
            System.out.println("Welcome all of you....");
            // Attempting division which may throw ArithmeticException
            result = firstNumber / secondNumber;  // This line will throw ArithmeticException if secondNumber is 0
            System.out.println("Result: " + result);  // This line won't execute if exception is thrown
            System.out.println("Thank you....");  // This line won't execute if exception is thrown
        } catch (ArithmeticException e) {
            // Catch block to handle ArithmeticException
            System.out.println("Exception caught: Division by zero is not allowed.");
            // Assigning a default value to result to avoid uninitialized variable error
            result = 20 / 10;  // Assigning a valid division result
        }

        // Continue with other program logic
        System.out.println("Program continues after the try-catch block.");
    }
}
/* Output
Welcome all of you....
Program continues after the try-catch block.
*/