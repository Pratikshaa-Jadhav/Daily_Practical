package method;

//Employee.java - Base class for all employees
class Employee {
 // Properties common to all employees
 private String name;
 private String address;
 private double salary;
 private String jobTitle;

 // Constructor to initialize properties
 public Employee(String name, String address, double salary, String jobTitle) {
     this.name = name;
     this.address = address;
     this.salary = salary;
     this.jobTitle = jobTitle;
 }

 // Method to calculate bonus (abstract, to be implemented by subclasses)
 public double calculateBonus() {
     return 0.0;
 }

 // Method to generate performance report (abstract, to be implemented by subclasses)
 public void generatePerformanceReport() {
     System.out.println("Performance report for " + name + ":");
     // Implement logic to generate performance report
 }

 // Method to manage projects (abstract, to be implemented by subclasses)
 public void manageProjects() {
     System.out.println(name + " is managing projects.");
     // Implement logic to manage projects
 }

 // Getters and setters
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getAddress() {
     return address;
 }

 public void setAddress(String address) {
     this.address = address;
 }

 public double getSalary() {
     return salary;
 }

 public void setSalary(double salary) {
     this.salary = salary;
 }

 public String getJobTitle() {
     return jobTitle;
 }

 public void setJobTitle(String jobTitle) {
     this.jobTitle = jobTitle;
 }
}

//Manager.java - Subclass of Employee for managers
class Manager extends Employee {
 // Constructor
 public Manager(String name, String address, double salary, String jobTitle) {
     super(name, address, salary, jobTitle);
 }

 // Override method to calculate bonus for managers
 @Override
 public double calculateBonus() {
     // Implement calculation logic for bonus of a manager
     return getSalary() * 0.1; // 10% of salary
 }

 // Override method to generate performance report for managers
 @Override
 public void generatePerformanceReport() {
     super.generatePerformanceReport();
     // Additional logic specific to generating performance report for managers
 }

 // Override method to manage projects for managers
 @Override
 public void manageProjects() {
     super.manageProjects();
     // Additional logic specific to managing projects for managers
 }
}

//Developer.java - Subclass of Employee for developers
class Developer extends Employee {
 // Constructor
 public Developer(String name, String address, double salary, String jobTitle) {
     super(name, address, salary, jobTitle);
 }

 // Override method to calculate bonus for developers
 @Override
 public double calculateBonus() {
     // Implement calculation logic for bonus of a developer
     return getSalary() * 0.05; // 5% of salary
 }

 // Override method to generate performance report for developers
 @Override
 public void generatePerformanceReport() {
     super.generatePerformanceReport();
     // Additional logic specific to generating performance report for developers
 }

 // Override method to manage projects for developers
 @Override
 public void manageProjects() {
     super.manageProjects();
     // Additional logic specific to managing projects for developers
 }
}

//Programmer.java - Subclass of Employee for programmers
class Programmer extends Employee {
 // Constructor
 public Programmer(String name, String address, double salary, String jobTitle) {
     super(name, address, salary, jobTitle);
 }

 // Override method to calculate bonus for programmers
 @Override
 public double calculateBonus() {
     // Implement calculation logic for bonus of a programmer
     return getSalary() * 0.08; // 8% of salary
 }

 // Override method to generate performance report for programmers
 @Override
 public void generatePerformanceReport() {
     super.generatePerformanceReport();
     // Additional logic specific to generating performance report for programmers
 }

 // Override method to manage projects for programmers
 @Override
 public void manageProjects() {
     super.manageProjects();
     // Additional logic specific to managing projects for programmers
 }
}

//Main5.java - Driver class
public class Main5 {
 public static void main(String[] args) {
     // Create instances of Manager, Developer, and Programmer
     Manager manager = new Manager("John Doe", "123 Main St", 100000, "Manager");
     Developer developer = new Developer("Alice Smith", "456 Oak St", 80000, "Developer");
     Programmer programmer = new Programmer("Bob Johnson", "789 Elm St", 90000, "Programmer");

     // Calculate and print bonuses for each employee
     System.out.println("Bonus for Manager: $" + manager.calculateBonus());
     System.out.println("Bonus for Developer: $" + developer.calculateBonus());
     System.out.println("Bonus for Programmer: $" + programmer.calculateBonus());

     // Generate
	}
}