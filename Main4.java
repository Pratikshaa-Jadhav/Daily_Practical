package method;

//Create a parent class called "Vehicle" with attributes such as brand, model, year,
//and a method called "drive". Create a child class called "Car" that inherits from Vehicle
//and has an additional attribute called "color" and a method called "honk".
//Create an object of the Car class and call both the "drive" and "honk" methods.

//Parent class Vehicle
class Vehicle {
 // Attributes
 private String brand;
 private String model;
 private int year;

 // Constructor
 public Vehicle(String brand, String model, int year) {
     this.brand = brand;
     this.model = model;
     this.year = year;
 }

 // Method to drive the vehicle
 public void drive() {
     System.out.println("The " + year + " " + brand + " " + model + " is driving.");
 }
}

//Child class Car that inherits from Vehicle
class Car extends Vehicle {
 // Additional attribute
 private String color;

 // Constructor
 public Car(String brand, String model, int year, String color) {
     super(brand, model, year);  // Call the constructor of the parent class
     this.color = color;
 }

 // Method to honk the car horn
 public void honk() {
     System.out.println("The car is honking: Beep beep!");
 }
}

//Main class to test the Car class
public class Main4th {
 public static void main(String[] args) {
     // Create an object of the Car class
     Car myCar = new Car("Audi", "Luxury vehicles", 1909, "Red");

     // Call the methods
     myCar.drive();
     myCar.honk();
 }
}
