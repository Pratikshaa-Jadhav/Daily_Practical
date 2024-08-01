// Car class definition
class Car {
    // Attributes
    String make;
    String model;
    short year;
    int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
}

public class carDetails {
    public static void main(String[] args) {
        // Create Car objects
        Car car1 = new Car("Toyota", "Camry", (short) 2020, 25000);
        Car car2 = new Car("Honda", "Accord", (short) 2019, 22000);
        
        // Display car details
        System.out.println("Car 1 Details:");
        System.out.println("Make: " + car1.make);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);
        System.out.println("Price: " + car1.price);

        System.out.println("\nCar 2 Details:");
        System.out.println("Make: " + car2.make);
        System.out.println("Model: " + car2.model);
        System.out.println("Year: " + car2.year);
        System.out.println("Price: " + car2.price);
    }
}

/*output:
 Car 1 Details:
Make: Toyota
Model: Camry
Year: 2020
Price: 25000

Car 2 Details:
Make: Honda
Model: Accord
Year: 2019
Price: 22000
 */
