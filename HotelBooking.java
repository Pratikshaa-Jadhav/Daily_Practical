package collection;

import java.util.Scanner;

public class HotelBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomType;
        int nights;
        double totalCost;
        double grandTotal = 0;
        final double singleRoomRate = 100.0;
        final double doubleRoomRate = 150.0;
        final double suiteRoomRate = 250.0;
        final double taxRate = 0.1; // 10% tax
        final double discountRate = 0.05; // 5% discount for long stays
        String choice = null;

        do {
            System.out.println("Welcome to Hotel Booking System");
            System.out.println("Please select the room type:");
            System.out.println("1. Single Room (100 per night)");
            System.out.println("2. Double Room (150 per night)");
            System.out.println("3. Suite (250 per night)");
            System.out.print("Enter your choice (1-3): ");
            roomType = scanner.nextInt();

            switch (roomType) {
                case 1:
                    System.out.println("You selected Single Room.");
                    System.out.print("Enter the number of nights: ");
                    nights = scanner.nextInt();
                    totalCost = nights * singleRoomRate;
                    break;

                case 2:
                    System.out.println("You selected Double Room.");
                    System.out.print("Enter the number of nights: ");
                    nights = scanner.nextInt();
                    totalCost = nights * doubleRoomRate;
                    break;

                case 3:
                    System.out.println("You selected Suite.");
                    System.out.print("Enter the number of nights: ");
                    nights = scanner.nextInt();
                    totalCost = nights * suiteRoomRate;
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid room type.");
                    continue; // Skip the rest of the loop if an invalid choice was made
            }

            System.out.println("Total cost for your stay: $" + totalCost);
            grandTotal += totalCost;

            System.out.print("Do you want to make another booking? (y/n): ");
            choice = scanner.next();
        } while (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y');

        // Apply discount for long stays
        if (grandTotal > 500) { // Example condition: total cost over $500
            double discount = grandTotal * discountRate;
            grandTotal -= discount;
            System.out.println("Discount applied: -$" + discount);
        }

        // Calculate tax
        double tax = grandTotal * taxRate;
        double finalTotal = grandTotal + tax;

        // Billing system
        System.out.println("\n--- Billing Summary ---");
        System.out.println("Grand Total before tax: " + grandTotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Final Total after tax: " + finalTotal);
        
        // Payment Process
        System.out.println("Select payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. Cash");
        System.out.print("Enter your choice (1-3): ");
        int paymentMethod = scanner.nextInt();

        switch (paymentMethod) {
            case 1:
                System.out.println("Processing Credit Card payment...");
                break;
            case 2:
                System.out.println("Processing Debit Card payment...");
                break;
            case 3:
                System.out.println("Processing Cash payment...");
                break;
            default:
                System.out.println("Invalid payment method selected!");
                break;
        }

        System.out.println("Payment successful!");
        System.out.println("Thank you for booking with us. Have a pleasant stay!");

       
    }
}


