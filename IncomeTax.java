package method;

//Write a program in Java to accept the name of an employee and his/her annual income. Pass the name and the annual income. Displays the name of the employee and the income tax as per the given tariff:
Annual Income


import java.util.Scanner;

public class IncomeTax {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Accept the name of the employee
      System.out.print("Enter the name of the employee: ");
      String name = scanner.nextLine();

      // Accept the annual income of the employee
      System.out.print("Enter the annual income: ");
      double income = scanner.nextDouble();

      // Calculate income tax based on the given tariff
      double tax = 0;
      if (income <= 250000) {
          tax = 0; // No tax
      } else if (income <= 500000) {
          tax = 0.1 * (income - 250000); // 10% of the income exceeding ₹2,50,000
      } else if (income <= 1000000) {
          tax = 30000 + 0.2 * (income - 500000); // ₹30,000 + 20% of the amount exceeding ₹5,00,000
      } else {
          tax = 100000 + 0.3 * (income - 1000000); // ₹1,00,000 + 30% of the amount exceeding ₹10,00,000
      }

      // Display the name of the employee and the income tax
      System.out.println("\nName of the employee: " + name);
      System.out.printf("Income Tax: "+tax);
  }
}

/*
Output:
1)
  Enter the name of the employee: Fatima
  Enter the annual income: 300000

  Name of the employee: Fatima
  Income Tax: 5000.0
2)
  Enter the name of the employee: Tanjila
  Enter the annual income: 450000

  Name of the employee: Tanjila
  Income Tax: 20000.0
*/