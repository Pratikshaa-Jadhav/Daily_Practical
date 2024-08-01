
/* Write a Java program to create a class called Rectangle with private instance variables length and width. 
Provide public getter and setter methods to access and modify these variables.*/

package method;


// Define a class called Rectangle
public class Rectangle {
    // Private fields to store length and width of the rectangle
    private int length;
    private int width;

    // Getter method for retrieving the length of the rectangle
    public int getLength() {
        return length;
    }

    // Setter method for setting the length of the rectangle
    public void setLength(int length) {
        this.length = length;
    }

    // Getter method for retrieving the width of the rectangle
    public int getWidth() {
        return width;
    }

    // Setter method for setting the width of the rectangle
    public void setWidth(int width) {
        this.width = width;
    }

}

// Define a class called Test1
public class Test1 {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Create a new Rectangle object
        Rectangle rec = new Rectangle();

        // Set the length and width of the rectangle
        rec.setLength(24);
        rec.setWidth(22);

        // Print out the length and width of the rectangle
        System.out.println("Rectangle Length is:" + rec.getLength());
        System.out.println("Rectangle Width is:" + rec.getWidth());
    }

}

/*
Output
Rectangl Length is :24
Rectangl Width is  :22
*/