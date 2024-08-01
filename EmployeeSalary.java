package method;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        // Loop to calculate gross salary for multiple employees until user chooses to exit
        do {
            System.out.print("Enter the basic salary: ");
            double basicSalary = scanner.nextDouble();
            
            double grossSalary = calculateGrossSalary(basicSalary);
            
            System.out.println("Gross Salary: " + grossSalary);
            
            System.out.println("Enter -1 to exit or any other number to continue:");
            choice = scanner.nextInt();
            
        } while (choice != -1);
        
        scanner.close();
    }
    
    // Method to calculate gross salary based on given conditions
    public static double calculateGrossSalary(double basicSalary) {
        double hra, da;
        
        // Checking basic salary to determine HRA and DA percentages
        if (basicSalary > 15000) {
            hra = 0.2 * basicSalary;
            da = 0.6 * basicSalary;
        } else {
            hra = 3000;
            da = 0.7 * basicSalary;
        }
        
        // Calculating and returning gross salary
        return basicSalary + hra + da;
    }
}
