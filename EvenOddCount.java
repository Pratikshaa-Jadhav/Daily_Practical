// Write a Java program to find the number of even and odd integers in a given array of integers.

package method;

public class EvenOddCount {

    // Method to count the number of even and odd integers in an array
    public static void countEvenOdd(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        // Loop through the array and count even and odd numbers
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the counts
        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);
    }

    // Main method to test the countEvenOdd method
    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Count even and odd integers
        countEvenOdd(numbers);
    }
}
/*Number of even integers: 5
Number of odd integers: 5*/