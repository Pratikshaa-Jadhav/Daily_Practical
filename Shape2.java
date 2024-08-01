
//Create an abstract class Shape with an abstract method calculateArea(). Implement two subclasses, Circle and Rectangle, which inherit from Shape and provide their own implementations of calculateArea(). Write a program to calculate and print the areas of a circle and a rectangle. 



package method;

//Abstract class
abstract class Shape {
 // Abstract method
 abstract double calculateArea();
}

//Subclass for Circle
class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Subclass for Rectangle
class Rectangle extends Shape {
 private double width;
 private double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 double calculateArea() {
     return width * height;
 }
}

//Main program to calculate and print areas
public class Shape2 {
 public static void main(String[] args) {
     // Create a Circle object
     Shape circle = new Circle(5);
     System.out.println("The area of the circle is: " + circle.calculateArea());

     // Create a Rectangle object
     Shape rectangle = new Rectangle(4, 6);
     System.out.println("The area of the rectangle is: " + rectangle.calculateArea());
 }
}

/* Output:
 * The area of the circle is: 78.53981633974483
The area of the rectangle is: 24.0*/
