package method;

/*
1. Given an integer U denoting the amount of KWh units of electricity consumed, the task is to calculate the electricity bill with the help of the below charges:

· 1 to 100 units – Rs. 10/unit
· 100 to 200 units – Rs. 15/unit
· 200 to 300 units – Rs. 20/unit
· above 300 units – Rs. 25/unit

Input: U = 250
Output: 3500
*/

import java.util.Scanner;

public class ElectricityBill {
    // Method to calculate electricity bill
    public static int calculateBill(int units) {
        int bill = 0;

        // Calculate bill based on different unit ranges
        if (units <= 100) {
            bill = units * 10;
        } else if (units <= 200) {
            bill = 1000 + (units - 100) * 15;
        } else if (units <= 300) {
            bill = 2500 + (units - 200) * 20;
        } else {
            bill = 4500 + (units - 300) * 25;
        }

        // Return the calculated bill
        return bill;
    }
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the amount of KWh units consumed
        System.out.print("Enter the amount of KWh units consumed: ");
        int units = scanner.nextInt();

        // Calculate the electricity bill using the calculateBill method
        int bill = calculateBill(units);

        // Print the electricity bill
        System.out.println("Electricity bill: Rs. " + bill);
    }
}

/*
 Output:
 1)
 Enter the amount of KWh units consumed: 250
 Electricity bill: Rs. 3500
 2)
 Enter the amount of KWh units consumed: 300
 Electricity bill: Rs. 4500
 */
