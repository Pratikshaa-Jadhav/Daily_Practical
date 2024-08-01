package method;

//Main class to run the program
public class Main {
 public static void main(String[] args) {
     // Instantiate Car and Bike objects
     Car myCar = new Car("Toyota", "Camry", 2022, 180);
     Bike myBike = new Bike("Honda", "CBR", 2020, 150);

     // Print their attributes
     System.out.println("Car Details:");
     System.out.println("Make: " + myCar.make);
     System.out.println("Model: " + myCar.model);
     System.out.println("Year: " + myCar.year);
     System.out.println("Maximum Speed: " + myCar.maximumSpeed);

     System.out.println("\nBike Details:");
     System.out.println("Make: " + myBike.make);
     System.out.println("Model: " + myBike.model);
     System.out.println("Year: " + myBike.year);
     System.out.println("Maximum Speed: " + myBike.maximumSpeed);

     // Call the drive method for both
     myCar.drive();
     myBike.drive();
 }
}

//Vehicle class with attributes and a drive method
class Vehicle {
 String make;
 String model;
 int year;
 int maximumSpeed;

 // Constructor with parameters
 public Vehicle(String make, String model, int year, int maximumSpeed) {
     this.make = make;
     this.model = model;
     this.year = year;
     this.maximumSpeed = maximumSpeed;
 }

 // Drive method to be overridden in subclasses
 public void drive() {
     System.out.println("Vehicle is driving");
 }
}

//Car subclass extending Vehicle
class Car extends Vehicle {
 // Constructor calling super()
 public Car(String make, String model, int year, int maximumSpeed) {
     super(make, model, year, maximumSpeed);
 }

 // Overriding the drive method
 @Override
 public void drive() {
     System.out.println(make + " " + model + " Car is driving");
 }
}

//Bike subclass extending Vehicle
class Bike extends Vehicle {
 // Constructor calling super()
 public Bike(String make, String model, int year, int maximumSpeed) {
     super(make, model, year, maximumSpeed);
 }

 // Overriding the drive method
 @Override
 public void drive() {
     System.out.println(make + " " + model + " Bike is driving");
 }
}
